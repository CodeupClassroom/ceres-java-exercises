package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2)) ;
    }

    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }


    @Override
    public void setColor(String color) {
        super.color = color;
    }
}
