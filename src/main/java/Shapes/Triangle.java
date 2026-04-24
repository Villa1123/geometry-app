package Shapes;

public class Triangle implements Shape{

    private double sideA,sideB,sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;

    }

    @Override
    public double area() {
        double Heron = (sideA+sideB+sideC)/2;
        return Math.sqrt(Heron*(Heron - sideA)*(Heron - sideB)*(Heron - sideC));

    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
