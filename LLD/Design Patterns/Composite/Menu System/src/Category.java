import java.util.ArrayList;
import java.util.List;

public class Category implements MenuSystemNode{

    private final String name;

    List<MenuSystemNode> children = new ArrayList<>();

    Category(String name){
        this.name = name;
    }

    public void add(MenuSystemNode node){
        children.add(node);
    }

    public void remove(MenuSystemNode node){
        children.remove(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        double totalCost = 0.0;

        for(MenuSystemNode node:children){
            totalCost+= node.getCost();
        }

        // Round to 2 decimal places
        return Math.round(totalCost * 100.0) / 100.0;
    }

    @Override
    public void printMenu(String indent) {
        System.out.println(indent+"+  "+name);
        for(MenuSystemNode node:children){
            node.printMenu(indent + "   ");
        }

    }
}
