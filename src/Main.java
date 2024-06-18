import java.util.Date;
import java.util.List;

enum FoodCategory {
    STARTER, MAIN, DESSERT
}

enum BeverageType {
    NON_ALCOHOLIC, ALCOHOLIC
}

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        MenuItem pizza = new Food("Pizza", "Cheesy pizza", 10.0, FoodCategory.MAIN);
        MenuItem soda = new Beverage("Soda", "Cold soda", 2.0, BeverageType.NON_ALCOHOLIC);
        MenuItem beer = new Beverage("Beer", "Alcoholic beer", 5.0, BeverageType.ALCOHOLIC);

        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(soda);
        restaurant.addMenuItem(beer);

        List<MenuItem> order1Items = List.of(pizza, soda);
        List<Integer> order1Quantities = List.of(1, 2);
        Order order1 = new Order(new Date(), order1Items, order1Quantities, 2.0);

        List<MenuItem> order2Items = List.of(beer);
        List<Integer> order2Quantities = List.of(3);
        Order order2 = new Order(new Date(), order2Items, order2Quantities, 5.0);

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        System.out.println(restaurant.getDailyReport());
    }
}
