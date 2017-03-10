import com.google.gson.Gson;
import inventory.Inventory;
import inventory.InventoryItem;
import printers.ItemTotalWorthPrinter;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        ItemTotalWorthPrinter printer = new ItemTotalWorthPrinter(inventory);
        System.out.println(printer.toCsv());
        System.out.println(printer.toPipeSeparated());
        System.out.println(inventory.getLocaleFor("toothpaste"));
        Gson gson = new Gson();
        Map<String, String> jsonObject = gson.fromJson("{ \"India\":\"paste\",\"Aus\": \"manjan\" }", Map.class);
        System.out.println(jsonObject.keySet());
    }
}
