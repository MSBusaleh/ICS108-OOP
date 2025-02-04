package com.example.labproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {

    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 600;

    private static Stage stage;
    private static Scene gameScene, overScene;
    private static Pane gameLayout;

    private static ArrayList<fallingObj> Burgers;
    private static Text strikes, points;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        gameLayout = new Pane();
        points = new Text("Points: " + fallingObj.getPoints());
        strikes = new Text("Strikes: " + fallingObj.getStrikes());


        // create home screen
        Text title = new Text("Welcome to Catch Game");
        Button playButton = new Button("Play Game");
        playButton.setOnAction(e -> StartGame());
        VBox homeLayout = new VBox(20, title, playButton);
        homeLayout.setPadding(new Insets(20));
        homeLayout.setAlignment(Pos.CENTER);
        Scene homeScene = new Scene(homeLayout, WINDOW_WIDTH, WINDOW_HEIGHT);
        gameScene = new Scene(gameLayout, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(homeScene);
        stage.setTitle("Catch Game");
        stage.show();


        // create game over screen
        Text title2 = new Text("Game Over!!");
        Button restartButton = new Button("restart the Game");
        restartButton.setOnAction(e -> {
            StartGame();
            fallingObj.reset();
            strikes.setText("Strikes: " + fallingObj.getStrikes());
            points.setText("Points: " + fallingObj.getPoints());
        });

        VBox GoverLayout = new VBox(20, title2, restartButton);
        GoverLayout.setPadding(new Insets(20));
        GoverLayout.setAlignment(Pos.CENTER);
        overScene = new Scene(GoverLayout, WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    private static void StartGame() {
        VBox header = new VBox(strikes, points);
        header.setSpacing(10);
        header.setPadding(new Insets(10));
        header.setStyle("-fx-background-color: #FFFFFF;");
        gameLayout.getChildren().add(header);

        Burgers = new ArrayList<>();
        for (int b = 0; b<3; b++) {
            Burgers.add( new fallingObj(strikes, points));
            gameLayout.getChildren().add( Burgers.get(b).getB1());
            Burgers.get(b).play();
        }

        stage.setScene(gameScene);
        stage.setTitle("Start");
    }
    private static void showHomeScreen() {
        stage.setScene(gameScene);
        stage.setTitle("Catch Game - Play");
    }
    private static void showGameOverScene() {
        gameLayout.getChildren().clear();
        stage.setScene(overScene);
        stage.setTitle("Game Over");
    }

    public static void gameOverChecker() {
        if (fallingObj.getStrikes() == 0) {
            showGameOverScene();
            fallingObj.freezeAll();
        }
    }

    public static void objectsIncrease(){
        Burgers.add(new fallingObj(strikes, points));
        int newIndex = Burgers.size()-1;
        gameLayout.getChildren().add( Burgers.get(newIndex).getB1());
        Burgers.get(newIndex).play();
    }

    public static void main(String[] args) {launch();}
}