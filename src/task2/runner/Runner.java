package task2.runner;

import task2.figures.BaseFigure;
import task2.figures.Circle;
import task2.figures.Rectangle;
import task2.figures.Triangle;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(4,7,10);
        Rectangle rectangle=new Rectangle(5, 8);
        Circle circle=new Circle(5);

        ArrayList<BaseFigure> figures=new ArrayList<>();

        figures.add(triangle);
        figures.add(rectangle);
        figures.add(circle);

        for (BaseFigure figure1:figures){
            System.out.println(figure1.name+" "+figure1.getPerimeter());
        }
    }
}
