import java.util.ArrayList;

public class Drone {
    private Coordinate position;
    private ArrayList<Product> products;
    private final int id;

    public Drone(int id) {
        this.position = new Coordinate(0, 0);
        this.products = new ArrayList<Product>();
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
