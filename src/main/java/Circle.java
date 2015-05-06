/**
 * Created by p3700299 on 05/05/15.
 */
public class Circle extends Shape {

    public Circle(int radius) {
        super(1);
        setSide(0, radius);
    }

    public double area() {
        return Math.PI * Math.pow(getSide(0), 2);
    }
}
