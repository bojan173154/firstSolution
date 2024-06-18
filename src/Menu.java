import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu {
    private List<MenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public Optional<MenuItem> getItem(String name) {
        return items.stream().filter(item -> item.getName().equals(name)).findFirst();
    }

    public List<MenuItem> getItems() {
        return items;
    }
}