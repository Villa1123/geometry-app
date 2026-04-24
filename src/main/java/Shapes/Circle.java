package Shapes;

public class Circle implements Shape {

    private double width;
    private double height;

    public Circle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }


    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

}
