import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Restaurant {
    private Menu menu;
    private List<Order> orders;

    public Restaurant() {
        this.menu = new Menu();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.addItem(item);
    }

    public void removeMenuItem(MenuItem item) {
        menu.removeItem(item);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Optional<Order> getOrder(int id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst();
    }

    public double getTotalEarnings() {
        return orders.stream().mapToDouble(Order::calculateTotalEarnings).sum();
    }

    public String getDailyReport() {
        StringBuilder report = new StringBuilder();
        orders.stream().sorted((o1, o2) -> o1.orderTime.compareTo(o2.orderTime))
                .forEach(order -> report.append(order.getOrderDetails()).append("\n"));
        report.append("Total Earnings for the Day: ").append(getTotalEarnings()).append("\n");
        return report.toString();
    }
}