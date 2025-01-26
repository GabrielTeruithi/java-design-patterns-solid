package designpatterns.creational.abstractfactory;
 
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }

    @Override
    public void onClick(String f) {
        System.out.println(f);
    }
    
}