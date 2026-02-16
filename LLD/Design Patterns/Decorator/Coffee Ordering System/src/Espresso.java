public class Espresso implements Coffee {

    private final PriceConfig priceConfig;

    public Espresso(PriceConfig priceConfig) {
        this.priceConfig = priceConfig;
    }

    @Override
    public double getCost() {
        return priceConfig.getPrice("ESPRESSO");
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
