import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<InventoryItem> items = new ArrayList<>();

    public Inventory() {
        InventoryItem toothpaste = new InventoryItem(new Product(1, "toothpaste"), 50, 10);
        InventoryItem bournvita = new InventoryItem(new Product(1, "bournvita"), 100, 7);
        items.add(toothpaste);
        items.add(bournvita);
    }

    public List<InventoryItem> getItems() {
        return items;
    }
}
