package task2.figures;
/*
a class with a triangle object and a method for finding its perimeter
 */
public class Triangle extends BaseFigure{

    public int side1;
    public int side2;
    public int side3;

    public Triangle( int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.name = "Triangle";
    }
    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }
}
