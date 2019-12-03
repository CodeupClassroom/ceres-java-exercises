package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    @Override
    void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return (super.width * super.width);
    }

    @Override
    public void setColor(String color) {
        super.color = color;
    }
}
