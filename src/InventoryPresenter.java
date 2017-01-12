import java.util.List;

public class InventoryPresenter {

    public void display(List<InventoryItem> items) {
        items.forEach(item -> System.out.println(item.getName() + " || " + item.getTotalWorth()));
    }
}
