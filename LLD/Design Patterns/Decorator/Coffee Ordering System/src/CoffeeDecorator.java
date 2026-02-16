public abstract  class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        if (coffee == null) {
            throw new IllegalArgumentException("Coffee cannot be null");
        }else{
            this.coffee = coffee;
        }
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

}
