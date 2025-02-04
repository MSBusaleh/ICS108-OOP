import Point.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point[] myPoints = new Point[5];

        for(int i = 0; i< myPoints.length; i++){
            myPoints[i] = new Point((int)(Math.random()*100),(int)(Math.random()*100));
        }



        for(Point e: myPoints)
            System.out.print(e + "  ");

        Arrays.sort(myPoints);
        System.out.println();

        for(Point e: myPoints)







            System.out.print("p me");


    }
}