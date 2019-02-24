

public class CircleMain {
    public static void main(String[] args) {
        Point center = new Point(3, 4);
        double radius = 5;
        Circle c = new Circle(center, radius);
        System.out.println(c.getDistance());;
    }
}