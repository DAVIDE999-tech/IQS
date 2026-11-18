package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void palceOrders() {
        for (Order order : orders) {
            order.execute(); // Non sappiamo il tipo di comando
        }
        orders.clear();
    }
}
