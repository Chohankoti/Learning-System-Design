public class Item implements MenuSystemNode{

    private final String name;
    private final double cost;

    Item(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void printMenu(String indent) {
        System.out.println(indent + "-  " + name + " : " + "$"+cost);
    }
}
