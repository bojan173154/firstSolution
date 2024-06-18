import java.util.Date;
import java.util.List;

public class Order {
    private static int idCounter = 0;
    private int id;
    Date orderTime;
    private List<MenuItem> items;
    private List<Integer> quantities;
    private double tip;

    public Order(Date orderTime, List<MenuItem> items, List<Integer> quantities, double tip) {
        this.id = ++idCounter;
        this.orderTime = orderTime;
        this.items = items;
        this.quantities = quantities;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public double calculateTotalBalance() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            total += (item.getPrice() * quantities.get(i)) * (1 + item.getTax());
        }
        return total;
    }

    public double calculateTotalEarnings() {
        return calculateTotalBalance() + tip;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Order ID: ").append(id).append("\n");
        details.append("Time: ").append(orderTime).append("\n");
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            details.append(String.format("%s x%d @ %.2f each\n", item.getName(), quantities.get(i), item.getPrice()));
        }
        details.append("Total Balance: ").append(calculateTotalBalance()).append("\n");
        details.append("Total Earnings: ").append(calculateTotalEarnings()).append("\n");
        return details.toString();
    }
}