package designpatterns.creational.abstractfactory;

public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("Render HTML Button");
    }

    @Override
    public void onClick(String f) {
        System.out.println(f + "  HTML");
    }
    
}
