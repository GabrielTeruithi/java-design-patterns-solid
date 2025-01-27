package designpatterns.creational.prototype;

public class Circle extends Shape {

    int radius;

    public Circle(){
        super();
    }

    public Circle(Circle source) {
        super();
        this.radius = source.radius;
    }

    @Override
    Shape cloneShape() {
        return new Circle(this);
    }

}
