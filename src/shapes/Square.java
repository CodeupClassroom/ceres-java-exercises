package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }


    public double getSArea(){
        System.out.println("Square.getArea");
        return Math.pow(super.width, 2);
    }


    public double getSPerimeter(){
        System.out.println("Square.getPerimeter");
        return super.length * 4;
    }
}
