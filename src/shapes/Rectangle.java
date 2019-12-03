package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        super.length = length;
    }

    @Override
    void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return  2 * super.width + 2 * super.length;
    }

    @Override
    public double getArea() {
        return super.width * super.length;
    }

    @Override
    public void setColor(String color) {
        super.color = color;
    }
}
