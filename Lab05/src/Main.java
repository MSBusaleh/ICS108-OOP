public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(10, 30.5);

        System.out.println("Distance is: "+ point1.distance(point2));
    }
}