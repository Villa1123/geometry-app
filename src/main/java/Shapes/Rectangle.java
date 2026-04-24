package Shapes;

public class Rectangle {

    private double width,height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }


}
