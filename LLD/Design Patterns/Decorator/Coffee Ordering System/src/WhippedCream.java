public class WhippedCream extends CoffeeDecorator {

    private final PriceConfig priceConfig;

    WhippedCream(Coffee coffee, PriceConfig priceConfig) {
        super(coffee);
        this.priceConfig = priceConfig;
    }

    public String getDescription() {
        return super.getDescription() + ", WhippedCream";
    }

    public double getCost() {
        return super.getCost() + priceConfig.getPrice("WHIPPEDCREAM");
    }
}
