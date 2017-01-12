import java.util.List;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        List<InventoryItem> items = inventory.getItems();
        new InventoryPresenter().display(items);
    }
}
