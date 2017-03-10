package database;


import java.util.Arrays;
import java.util.List;

public class InventoryTable {

    static class InventoryTableRow{
        Integer productId, quantity, unitPrice;
        String productName, nameInCountries;

        public InventoryTableRow(Integer productId, String productName, Integer quantity, Integer unitPrice,  String nameInCountries) {
            this.productId = productId;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.productName = productName;
            this.nameInCountries = nameInCountries;
        }
    }



    public static List<InventoryTableRow> allRows(){

        return Arrays.asList(
                new InventoryTableRow(1, "toothpaste",30,48,
                "{ \"India\":\"paste\",\"Aus\": \"manjan\" }"),
                new InventoryTableRow(2, "bournvita",70,90,
                "{ \"India\":\"tonic\",\"Aus\": \"\" }")
                );
    }
}
