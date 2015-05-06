/**
 * Created by p3700299 on 05/05/15.
 */
public class CalcArea {

    public static void main(String[] args) {

        System.out.println("Lets calculate the areas!");

        Square sq = new Square(5);
        System.out.println(String.format("Square area is: %d", sq.area()));

        Triangle tr = new Triangle(3, 4, 5);
        System.out.println(String.format("Triangle area is: %d", tr.area()));

        Rectangle rc = new Rectangle(4, 5);
        System.out.println(String.format("Rectangle area is: %d", rc.area()));

        Circle ci = new Circle(3);
        System.out.println(String.format("Circle area is: %d", ci.area()));

    }
}
