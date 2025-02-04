package designpatterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver price = new PriceObserver();

        order.attach(price);

        order.addItem(50);

        System.out.println(order);

        order.addItem(550);
        order.addItem(220);

        System.out.println(order);

    }
}
