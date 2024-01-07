import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private final Coordinate address;
    private HashMap<Integer, Integer> productCounts;

    public Warehouse(Coordinate address, int[] productCounts) {
        this.address = address;
        this.productCounts = new HashMap<Integer, Integer>();
        for (int i = 0; i < productCounts.length; i++) {
            this.productCounts.put(i, productCounts[i]);
        }
    }

    public Coordinate getAddress() {
        return address;
    }

    public HashMap<Integer, Integer> getProducts() {
        return productCounts;
    }

    public void addProducts(int productId, int amount) {
        if (this.productCounts.keySet().contains(productId))
            this.productCounts.put(productId, amount + this.productCounts.get(productId));
        else {
            this.productCounts.put(productId, amount);
        }
    }

    // TODO better structure
    public void removeProducts(int productId, int amount) {
        if (this.productCounts.keySet().contains(productId)) {
            if (this.productCounts.get(productId) < amount) {
                throw new IllegalArgumentException("Not enough Product to remove");
            }
            this.productCounts.put(productId, Math.max(amount - this.productCounts.get(productId), 0));
        } else {
            throw new IllegalArgumentException("No Product to remove");
        }
    }
}
