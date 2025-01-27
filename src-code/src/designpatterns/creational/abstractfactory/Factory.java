package designpatterns.creational.abstractfactory;

public class Factory {

    private GUIFactory factory ;
    private Button button;
    private Checkbox checkbox;

    public Factory(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI(){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.checked();
    }

}
