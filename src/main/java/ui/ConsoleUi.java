package ui;
//
import Shapes.*;

import java.util.Scanner;


public class ConsoleUi {

    Scanner scanner = new Scanner(System.in);

    public void chosseAShape() {
        System.out.println("Choose a shape\n1.Circle\n2.Rectangle\n3.Triangle");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> circle();
            case 2 -> rectangle();
            case 3 -> triangle();
            default -> System.out.println("plz type 1, 2 or 3");
        }
    }




    public void circle(){
        System.out.println("Enter circle radius:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        double area = circle.area();
        double circumference = circle.perimeter();

        System.out.printf("Circle Area: %.2f \n", area);
        System.out.printf("Circumference: %.2f", circumference);

    }

    public void rectangle(){
        System.out.println("Enter width:");
        double width = scanner.nextDouble();

        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);

    }

    public void triangle(){

        System.out.println("Enter side A: ");
        double sideA = scanner.nextDouble();

        System.out.println("Enter side B: ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter side C: ");
        double sideC = scanner.nextDouble();

        Triangle triangle = new Triangle(sideA,sideB,sideC);

        double area = triangle.area();
        double perimeter = triangle.perimeter();

        System.out.printf("Triangle Area: %.2f \n", area);
        System.out.printf("Triangle Perimeter: %.2f", perimeter);
    }

}
