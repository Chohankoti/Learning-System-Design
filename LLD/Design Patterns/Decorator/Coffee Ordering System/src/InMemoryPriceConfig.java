import java.util.Map;

public class InMemoryPriceConfig implements PriceConfig {

    private final Map<String, Double> priceMap;

    public InMemoryPriceConfig(Map<String, Double> priceMap) {
        this.priceMap = priceMap;
    }

    @Override
    public double getPrice(String itemCode) {
        return priceMap.getOrDefault(itemCode, 0.0);
    }
}
