public class Order {
    private final Coordinate address;
    private final int numberProducts;
    private final int[] productIds;

    public Order(Coordinate address, int numberProducts, int[] productIds) {
        this.address = address;
        this.numberProducts = numberProducts;
        this.productIds = productIds;
    }

    public Coordinate getAddress() {
        return address;
    }

    public int getNumberProducts() {
        return numberProducts;
    }

    public int[] getProducts() {
        return productIds;
    }
}
