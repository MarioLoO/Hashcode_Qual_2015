import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Reader {

    public ParsedInputData read(String path) {
        // Pfad zur .in-Datei

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String[] firstLineValues = reader.readLine().split(" ");
            int rowCount = Integer.parseInt(firstLineValues[0]);
            int colCount = Integer.parseInt(firstLineValues[1]);
            int droneCount = Integer.parseInt(firstLineValues[2]);
            int turnCount = Integer.parseInt(firstLineValues[3]);
            int maxPayload = Integer.parseInt(firstLineValues[4]);

            ArrayList<Drone> drones = new ArrayList<Drone>();
            for (int i = 0; i < droneCount; i++) {
                Drone drone = new Drone(i);
                drones.add(drone);
            }
            int productTypesCount = Integer.parseInt(reader.readLine());
            String[] productWeights = reader.readLine().split(" ");
            int[] parsedProductWeights = Arrays.stream(productWeights)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            ArrayList<Product> products = new ArrayList<Product>();
            for (int i = 0; i < parsedProductWeights.length; i++) {
                products.add(new Product(parsedProductWeights[i], i));
            }
            int wareHouseCount = Integer.parseInt(reader.readLine());
            ArrayList<Warehouse> warehouses = new ArrayList<Warehouse>();
            ArrayList<Order> orders = new ArrayList<Order>();

            for (int i = 0; i < wareHouseCount; i++) {
                String[] coords = reader.readLine().split(" ");
                String[] productCounts = reader.readLine().split(" ");
                int[] parsedProductCounts = Arrays.stream(productCounts)
                        .mapToInt(Integer::parseInt)
                        .toArray();
                Warehouse warehouse = new Warehouse(
                        new Coordinate(Integer.parseInt(coords[0]), Integer.parseInt(coords[1])), parsedProductCounts);
                warehouses.add(warehouse);
            }

            int orderCount = Integer.parseInt(reader.readLine());
            for (int i = 0; i < orderCount; i++) {

                String[] coords = reader.readLine().split(" ");
                int itemCount = Integer.parseInt(reader.readLine());
                String[] productsForOrderIds = reader.readLine().split(" ");
                int[] productsForOrder = new int[itemCount];
                for (int j = 0; j < itemCount; j++) {
                    productsForOrder[j] = Integer.parseInt(productsForOrderIds[j]);
                }
                Order order = new Order(new Coordinate(Integer.parseInt(coords[0]), (Integer.parseInt(coords[1]))),
                        itemCount, productsForOrder);
            }

            ParsedInputData parsedInput = new ParsedInputData(rowCount, colCount, turnCount, maxPayload, orders,
                    warehouses,
                    products, drones);
            return parsedInput;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}