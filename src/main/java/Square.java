/**
 * Created by p3700299 on 05/05/15.
 */
public class Square extends Shape {

    public Square(double valueSide) {
        super(1);
        setSide(0, valueSide);
    }

    public double area() {
        return getSide(0) * getSide(0);
    }
}
