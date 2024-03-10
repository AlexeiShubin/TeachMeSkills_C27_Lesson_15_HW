package task2.figures;
/*
a class with a rectangle object and a method for finding its perimeter
 */
public class Rectangle extends BaseFigure{
    public int a;
    public int b;

    public Rectangle(int a, int b){
        this.name="rectangle";
        this.a=a;
        this.b=b;
    }
    @Override
    public double getPerimeter() {
        return (2*a)+(2*b);
    }
}
