/**
 * Created by p3700299 on 05/05/15.
 */
public class Triangle extends Shape {

    public Triangle(double side1, double side2, double side3) {
        super(3);
        setSide(0, side1);
        setSide(1, side2);
        setSide(2, side3);
    }

    public double area() {

        return 34;
    }

}
