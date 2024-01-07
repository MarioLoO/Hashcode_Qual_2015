import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParsedInputData {
    private int rowCount;
    private int colCount;
    private int turnCount;
    private int maxPayload;
    private ArrayList<Order> orders;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Product> products;
    private ArrayList<Drone> drones;

    public ParsedInputData(int rowCount, int colCount, int turnCount, int maxPayload, ArrayList<Order> orders,
            ArrayList<Warehouse> warehouses, ArrayList<Product> products, ArrayList<Drone> drones) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.turnCount = turnCount;
        this.maxPayload = maxPayload;
        this.orders = orders;
        this.warehouses = warehouses;
        this.products = products;
        this.drones = drones;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Drone> getDrones() {
        return drones;
    }

    
}
