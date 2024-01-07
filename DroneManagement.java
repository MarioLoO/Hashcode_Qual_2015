import java.util.ArrayList;

public class DroneManagement {
    Reader reader = new Reader();
    private int rowCount;
    private int colCount;
    private int turnCount;
    private int maxPayload;
    private ArrayList<Order> orders;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Product> products;
    private ArrayList<Drone> drones;

    DroneManagement() {

    }

    public void readInput(String filePath) {
        ParsedInputData data = reader.read(filePath);
        this.rowCount = data.getRowCount();
        this.colCount = data.getColCount();
        this.maxPayload = data.getMaxPayload();
        this.turnCount = data.getTurnCount();
        this.drones = data.getDrones();
        this.orders = data.getOrders();
        this.products = data.getProducts();
        this.warehouses = data.getWarehouses();
    }


}
