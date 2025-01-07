import java.util.HashMap;

public class Cashier {
    private HashMap<String, Item> menuHashMap;

    public Cashier(){
        this.menuHashMap = new HashMap<>();
    }

    public String registerItem(String name, double price){
//        Put if condition later...
        Item item = new Item(name, price);
        this.menuHashMap.put(name, item);
        return "Sucess";
    }

    public String editItem(String name){
//        Put optional parameters...
        this.menuHashMap.get(name).setName(name);
        return "Sucess";
    }

    public String removeItem(String name){
        this.menuHashMap.remove(name);
        return "Sucess";
    }
}
