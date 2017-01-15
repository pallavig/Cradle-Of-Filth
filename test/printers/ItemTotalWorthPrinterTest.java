package printers;

import inventory.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTotalWorthPrinterTest {

    @Test
    public void shouldPrintDataInCSVFormat() {
        Inventory inventory = new Inventory();
        ItemTotalWorthPrinter printer = new ItemTotalWorthPrinter(inventory);
        String expectedString = "toothpaste, 500\n" + "bournvita, 700\n";
        assertEquals(expectedString, printer.toCsv());
    }

    @Test
    public void shouldPrintDataInPipeSeparatedFormat() {
        Inventory inventory = new Inventory();
        ItemTotalWorthPrinter printer = new ItemTotalWorthPrinter(inventory);
        String expectedString = "toothpaste||500\n" + "bournvita||700\n";
        assertEquals(expectedString, printer.toPipeSeparated());
    }
}
