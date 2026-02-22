//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item chicken65 = new Item("Chicken65", 149.80);
        Item chickenSoup = new Item("Chicken Soup", 58.12);

        Category staters = new Category("Staters");
        Category soups = new Category("Soups");

        staters.add(chicken65);
        soups.add(chickenSoup);

        Category nightMenu = new Category("Night Menu");

        nightMenu.add(staters);
        nightMenu.add(soups);

        nightMenu.printMenu("");

        System.out.println("Night menu total cost:"+nightMenu.getCost()+"\n");

        Item masalaDosa = new Item("Masala Dosa", 19.40);
        Item onionDosa = new Item("Onion Dosa", 15.78);

        Category dosa = new Category("Dosa");

        dosa.add(masalaDosa);
        dosa.add(onionDosa);

        Category morningMemu = new Category("Morning Menu");

        morningMemu.add(dosa);

        morningMemu.printMenu("");

        System.out.println("Morning menu total cost:"+morningMemu.getCost()+"\n");


        Category branchA = new Category("Branch A");

        branchA.add(morningMemu);
        branchA.add(nightMenu);

        branchA.printMenu("");

        System.out.println("Branch A menu total cost:"+branchA.getCost()+"\n");




    }
}