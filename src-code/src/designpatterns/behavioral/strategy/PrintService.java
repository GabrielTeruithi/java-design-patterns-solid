package designpatterns.behavioral.strategy;

import java.util.LinkedList;

//Context 
public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public PrintService() {

    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
