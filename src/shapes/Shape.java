package shapes;

abstract class Shape {
    protected String color;
    // Forces sub-classes to implement a color if they want to be a Shape
    public abstract void setColor(String color);
}