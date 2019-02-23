// import javafx.scene.chart.PieChartBuilder;

// A point object represents a pair of (x,y) coordinates
// Fourth Version: encapsulated

public class Point {
    private int x;
    private int y;

    // constructs a new point at the origin , (0,0)
    // public Point () {
    //     this(0,0);
    // }

    // constructs a new point with the given (x,y) location
    public Point(int x,int y) {
        setLocation(x, y);
    }

    // returns the distance between this Point and (0,0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // returns the x-coordinate of this point
    public int getX() {
        return x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return y;
    } 

    // sets this point's (x,y) location to the given values
    // pre: x >= 0 && y >= 0
    public void setLocation(int x,int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    // returns a String representation of this point
    public String toString() {
        return "("+x+","+y+")";
    }
    
    // shifts this point's location by the given amount
    public void translate(int dx,int dy) {
        setLocation(x + dx, y + dy);
    }

    // returns whether o refers to a Point with the same (X,Y)
    // coordinates as this Point
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else { //not a Point object
            return false;
        }
    }

}