package designpatterns.creational.prototype;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle nCircle = new Circle();
        nCircle.x = 10;
        nCircle.y = 10;
        nCircle.radius = 20;

        shapes.add(nCircle);

        Circle anotherCircle = (Circle) nCircle.cloneShape();

        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();

        rectangle.height = 10;
        rectangle.width = 10;

        shapes.add(rectangle);



        ArrayList<Shape> clonShapes  = new ArrayList<Shape>();

        for(Shape s : shapes){
            System.out.println(s.x);
            System.out.println(s.y);
            clonShapes.add(s.cloneShape());
        }


    }
    
}
