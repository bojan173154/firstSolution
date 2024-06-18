public abstract class MenuItem {
    private final String name;
    private String description;
    private final double price;
    private final double tax;

    public MenuItem(String name, String description, double price, double tax) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public abstract String getDetails();
}