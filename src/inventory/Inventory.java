package inventory;

import localize.Locale;
import localize.LocaleMapper;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<InventoryItem> items = new ArrayList<>();
    LocaleMapper<String> localeMapper = new LocaleMapper<>();

    public Inventory() {
        InventoryItem toothpaste = new InventoryItem(new Product(1, "toothpaste"), 50, 10);
        InventoryItem bournvita = new InventoryItem(new Product(1, "bournvita"), 100, 7);
        items.add(toothpaste);
        items.add(bournvita);

        localeMapper.add(toothpaste.getName(), Locale.IN, "paste");
        localeMapper.add(toothpaste.getName(), Locale.AUS, "manjan");

        localeMapper.add(bournvita.getName(), Locale.IN, "tonic");
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public String getLocaleFor(String productName) {
        String saperator = "\t|\t";
        StringBuilder header = new StringBuilder("Product Name");
        StringBuilder body = new StringBuilder(productName);
        for (Locale locale : Locale.values()) {
            header.append(saperator);
            header.append(locale);

            body.append(saperator);
            body.append(localeMapper.get(productName,locale));
        }

        return header.toString() + "\n" + body.toString();
    }
}
