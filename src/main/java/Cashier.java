import java.util.ArrayList;

public class Cashier {
    String name;
    ArrayList<Item> menu;

    public Cashier(String name){
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public boolean registerItem(String name, double price){
        this.menu.add(new Item(name, price));
        return true;
    }

    public void printItems(){
        for (Item item : menu){
            System.out.println(item);
        }
    }


}
