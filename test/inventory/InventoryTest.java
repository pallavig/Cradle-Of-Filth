package inventory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

    @Test
    public void shouldPrintTheLocaleForAProduct() {
        Inventory inventory = new Inventory();
        String expectedText = "Product Name\t|\tIndia\t|\tAustralia\ntoothpaste\t|\tpaste\t|\tmanjan";

        assertEquals(expectedText, inventory.getLocaleFor("toothpaste"));

        expectedText = "Product Name\t|\tIndia\t|\tAustralia\nbournvita\t|\ttonic\t|\t";

        assertEquals(expectedText, inventory.getLocaleFor("bournvita"));
    }
}
