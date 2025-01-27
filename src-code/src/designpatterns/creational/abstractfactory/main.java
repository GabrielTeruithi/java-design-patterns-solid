package designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {

        String os = getInput("Which OS, Win or Mac?");

        GUIFactory factory;

        if (os.equalsIgnoreCase("Win")) {
            factory = new WinFactory();
        } else if (os.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }

        Factory app = new Factory(factory);
        app.createUI();
        app.paint();

    }

    public static String getInput(String str) {

        Scanner reader = new Scanner(System.in);
        String input;
        System.out.println(str);
        input = reader.nextLine();
        reader.close();
        return input;

    }

}
