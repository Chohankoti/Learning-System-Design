public class Caramel extends CoffeeDecorator {

    private final PriceConfig priceConfig;

    Caramel(Coffee coffee, PriceConfig priceConfig){
        super(coffee);
        this.priceConfig = priceConfig;
    }

    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }

    public double getCost() {
        return super.getCost() + priceConfig.getPrice("CARAMEL");
    }
}
