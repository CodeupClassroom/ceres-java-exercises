package shapes;

import java.util.ArrayList;
import java.util.Set;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("box2.getPerimeter() = " + (int) box2.getPerimeter());
//        System.out.println("box2.getArea() = " + (int) box2.getArea());

        myShape = new Rectangle(5, 4);

        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

        myShape = new Square(5);

        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());


    }
}