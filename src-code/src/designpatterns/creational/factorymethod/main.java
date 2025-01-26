package designpatterns.creational.factorymethod;

public class main {

    public static void main(String[] args) {
        
        String message = "Teste";

        WebDialog dialogWeb = new WebDialog();
        Button htmlBtton = dialogWeb.createButton();

        htmlBtton.render();
        htmlBtton.onClick(message);


        WindowsDialog WindowsDialog = new WindowsDialog();
        Button windowsButton = WindowsDialog.createButton();

        windowsButton.render();
        windowsButton.onClick(message);
        
        

    }
    
}
