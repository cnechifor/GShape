/**
 * Created by p3700299 on 05/05/15.
 */
public abstract class Shape {


    private int sideCount;

    double sides[];

    public Shape(int nrSides) {
        sideCount = nrSides;
        sides = new double[sideCount];
    }

    protected void setSide(int iSide, double value) {
        if (iSide >= sideCount || iSide < 0)
            throw new RuntimeException("Invalid value for side index");

        if (value <= 0)
            throw new RuntimeException("Invalid value for side value");
    }


    protected double getSide(int iSide) {
        if (iSide >= sideCount || iSide < 0)
            throw new RuntimeException("Invalid value for side index");
        return sides[iSide];
    }

    public abstract double area();
}
