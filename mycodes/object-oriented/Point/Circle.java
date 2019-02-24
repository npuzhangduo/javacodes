// Represents circular shapes

public class Circle {
    private Point center;
    private double radius;

    // constructs a new circle with the given radius
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // returns the area of this circle
    public double getArea() {
        return Math.PI *radius * radius;
    }

    // return the distance from Circle center to origin
    public double getDistance() {
        return center.distanceFromOrigin();
    } 
}