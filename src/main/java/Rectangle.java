/**
 * Created by p3700299 on 05/05/15.
 */
public class Rectangle extends Shape {

    public Rectangle(double side1, double side2) {
        super(2);
        setSide(0, side1);
        setSide(1, side2);
    }

    public double area() {
        return getSide(0) * getSide(1);
    }
}
