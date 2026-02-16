import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> prices = Map.of(
                "CAPPUCCINO", 85.0,
                "ESPRESSO", 100.0,
                "MILK", 20.0,
                "CARAMEL", 30.0,
                "WHIPPED_CREAM", 40.0
        );

        PriceConfig config = new InMemoryPriceConfig(prices);

        Coffee coffee = new Cappuccino(config);
        coffee = new Milk(coffee, config);
        coffee = new Caramel(coffee, config);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

    }
}