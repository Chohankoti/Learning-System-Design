public class Cappuccino implements Coffee{

    private final PriceConfig priceConfig;

    public Cappuccino(PriceConfig priceConfig) {
        this.priceConfig = priceConfig;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double getCost() {
        return priceConfig.getPrice("CAPPUCCINO");
    }
}
