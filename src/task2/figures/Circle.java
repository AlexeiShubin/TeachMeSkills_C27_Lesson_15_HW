package task2.figures;
/*
a class with a circle object and a method for finding its perimeter
 */
public class Circle extends BaseFigure{

    int radius;
    public Circle(int radius){
        this.name="Circle";
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        return  2 * Math.PI * radius;
    }
}
