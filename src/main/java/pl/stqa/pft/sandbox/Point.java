package pl.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1) {
        double dx = x - p1.x;
        double dy = y - p1.y;

        return Math.sqrt((dx * dx) + (dy * dy));

    }

}
