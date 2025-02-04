public class Point {
    double xCord, yCord;

    Point(){
        xCord = 0.0;
        yCord = 0.0;
    }
    Point(double newX, double newY){
        xCord = newX;
        yCord = newY;
    }

    public double distance(Point a){
        double distance = Math.sqrt((xCord - a.xCord) * (xCord - a.xCord) + (yCord - a.yCord) * (yCord - a.yCord) );
        return distance;
    }

    }
