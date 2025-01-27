package designpatterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox{

    @Override
    public void checked() {
        System.out.println("Mac Checkbox checked!");
    }
    
}
