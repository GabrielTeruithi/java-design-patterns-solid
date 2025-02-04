package designpatterns.behavioral.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No proccessing done");
        return 10;
    }

}
