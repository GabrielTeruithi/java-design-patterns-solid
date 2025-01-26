package designpatterns.creational.factorymethod;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }
    
}
