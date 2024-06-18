public class Food extends MenuItem {
    private FoodCategory category;

    public Food(String name, String description, double price, FoodCategory category) {
        super(name, description, price, 0.08);
        this.category = category;
    }

    @Override
    public String getDetails() {
        return String.format("Food: %s, Category: %s, Price: %.2f, Tax: %.2f",
                getName(), category, getPrice(), getTax());
    }
}