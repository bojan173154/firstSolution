public class Beverage extends MenuItem {
    private BeverageType type;

    public Beverage(String name, String description, double price, BeverageType type) {
        super(name, description, price, type == BeverageType.NON_ALCOHOLIC ? 0.10 : 0.18);
        this.type = type;
    }

    @Override
    public String getDetails() {
        return String.format("Beverage: %s, Type: %s, Price: %.2f, Tax: %.2f",
                getName(), type, getPrice(), getTax());
    }
}