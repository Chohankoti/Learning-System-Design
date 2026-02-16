public class Milk extends CoffeeDecorator {

    private final PriceConfig priceConfig;

    public Milk(Coffee coffee, PriceConfig priceConfig) {
        super(coffee);
        this.priceConfig = priceConfig;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + priceConfig.getPrice("MILK");
    }

}
