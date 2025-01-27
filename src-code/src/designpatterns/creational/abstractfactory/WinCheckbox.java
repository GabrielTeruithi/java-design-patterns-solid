package designpatterns.creational.abstractfactory;

public class WinCheckbox implements Checkbox{

    @Override
    public void checked() {
        System.out.println("Win Checkbox checked!");
        
    }
    
}
