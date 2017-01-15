package printers;


import inventory.Inventory;

import java.util.stream.Collectors;

public class ItemTotalWorthPrinter {

    private Inventory inventory;

    public ItemTotalWorthPrinter(Inventory inventory){
        this.inventory = inventory;
    }

    public String toCsv(){
        return stringWithSeparator(", ");
    }

    public String toPipeSeparated(){
        return stringWithSeparator("||");
    }

    private String stringWithSeparator(String separator){
        StringBuilder result = new StringBuilder();
        inventory.getItems().forEach(item -> {
            result.append(item.getName());
            result.append(separator);
            result.append(item.getTotalWorth());
            result.append("\n");
        });
        return result.toString();

    }
}
