import inventory.Inventory;
import inventory.InventoryItem;
import printers.ItemTotalWorthPrinter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        ItemTotalWorthPrinter printer = new ItemTotalWorthPrinter(inventory);
        System.out.println(printer.toCsv());
        System.out.println(printer.toPipeSeparated());
    }
}
