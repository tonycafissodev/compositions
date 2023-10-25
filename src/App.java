import java.text.SimpleDateFormat;
import java.util.Date;

import enums.OrderStatus;
import model.Client;
import model.Order;
import model.OrderItem;
import model.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order();
        order.setMoment(new Date());
        order.setStatus(OrderStatus.PROCESSING);

        Client client = new Client("Alex Green", "alex@gmail.com", new Date());
        System.out.println(client);
        
        Product product = new Product("TV", 1000.00);
        OrderItem orderItem = new OrderItem(1, 1000.00, product);
        // System.out.println(orderItem);
        order.addItem(orderItem);

        Product product2 = new Product("Mouse", 40.0);
        OrderItem orderItem2 = new OrderItem(2, 40.0, product2);
        order.addItem(orderItem2);

        System.out.println(order);


    }
}
