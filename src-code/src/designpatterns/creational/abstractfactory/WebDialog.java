package designpatterns.creational.abstractfactory;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }
    
}
