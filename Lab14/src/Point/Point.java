package Point;

public class Point implements Comparable<Point> {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {

        if (x < o.x)
            return -1;
        else if (x > o.x)
            return 1;
        else if (y < o.y)
            return -1;
        else if (y > o.y)
            return 1;
        else
            return 0;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        } // if it's not an instance

        Point p = (Point) obj;

        if (p.x == x && p.y == y)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
