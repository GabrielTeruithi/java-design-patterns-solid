package designpatterns.creational.prototype;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(){
        super();
    }

    public Rectangle(Rectangle source){
        super();
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    Shape cloneShape() {
        return new Rectangle(this);

    }

}