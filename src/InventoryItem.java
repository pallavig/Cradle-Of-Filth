public class InventoryItem {

    private final Product product;
    private final int price;
    private final int quantity;

    public InventoryItem(Product product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalWorth() {
        return (price * quantity);
    }

    public String getName() {
        return product.getName();
    }
}
