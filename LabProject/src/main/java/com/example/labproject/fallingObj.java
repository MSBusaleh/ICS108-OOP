package com.example.labproject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.ArrayList;

import static java.lang.Math.random;

public class fallingObj {
    private static ArrayList<fallingObj> allObjects = new ArrayList<>(); //Will be used to control all the objects at once
    private static int strikes = 3;
    private static int points = 0;
    private ImageView b1; //The burger shape
    private Timeline falling; //the falling animation

    public fallingObj(Text strikersText, Text pointsText) {
        //Creates the burger and adjusts its size
        b1 = new ImageView(new Image("Burger.gif"));
        b1.setFitHeight(60);
        b1.setFitWidth(60);
        spawn(b1); //puts the burger in position

        //When the burger is clicked the user gets a point and the burger re-spawn
        b1.setOnMouseClicked(e -> {
            spawn(b1);
            points++;
            pointsText.setText("Points: " + getPoints());
            if(getPoints()>=5 && getPoints()%5==0)
                HelloApplication.objectsIncrease();

        });

        //The falling animation settings
        falling = new Timeline(new KeyFrame(Duration.millis(8.50),
                e -> {
                    if (b1.getY() == 550) {
                        spawn(b1);
                        strikes--;
                        strikersText.setText("Strikes: " + getStrikes());
                        HelloApplication.gameOverChecker();
                    } //if the burger reaches the bottom a strike is counted and the burger re-spawn
                    else {
                        b1.setY(b1.getY() + 1);
                    }
                })); // If the burger didn't reach the ground it keeps falling
        falling.setCycleCount(Timeline.INDEFINITE); // The cycle won't stop until stop function is called

        allObjects.add(this);
    }

    public static void spawn(ImageView fallingObj) { //This function... well, spawns stuff
        fallingObj.setX((int) (100 + random() * 800)); //The burger will be spawned in a random position
        fallingObj.setY(-100); // The burger will start from the top of the screen
    }

    public static void reset() {
        strikes = 3;
        points = 0;
        allObjects.clear();
    }

    // Animation control
    public void play() {
        falling.play();
    }
    public static void freezeAll(){
        for(fallingObj b: allObjects)
            b.falling.stop();
    }

    //Getters
    public ImageView getB1() {
        return b1;
    }
    public static int getPoints() {
        return points;
    }
    public static int getStrikes() {
        return strikes;
    }
}
