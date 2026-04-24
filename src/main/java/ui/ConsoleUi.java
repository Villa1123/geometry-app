package ui;

import Shapes.*;
import org.w3c.dom.css.Rect;

public class ConsoleUi {

    Shape shape;

    switch (shape) {
     case Circle -> circle();
     case Rectangle -> rectangle();
     case Triangle -> triangle();
     default -> System.out.println("Only supported shapes: circle, rectangle, triangle");
    }


    public void circle(){
        System.out.println("Enter circle radius:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        double area = Circle.calculateCircleArea(radius);
        double circumference = Circle.calculateCircleCircumference(radius);

        System.out.println("Circle Area: " + area);
        System.out.println("Circumference: " + circumference);

    }

    public void rectangle(){
        System.out.println("Enter width:");
        double width = scanner.nextDouble();

        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height)
        double area = Rectangle.calculateRectangleArea();
        double perimeter = Rectangle.calculateRectanglePerimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);

    }

    public void triangle(){
        Triangle triangle = new Trangle();
    }

}
