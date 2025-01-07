import java.util.HashMap;

public class Cashier {
    private HashMap<String, Item> menuHashMap;

    public Cashier(){
        this.menuHashMap = new HashMap<>();
    }

    public String registerItem(String name, double price){
        Item item = new Item(name, price);
        if(this.menuHashMap.containsKey(name)){
            return "Already in the menu";
        }
        this.menuHashMap.put(name, item);
        return "Sucess";
    }

    public String editItem(String name, String newname, double price, String desc, String category){
//        Put optional parameters...
        this.menuHashMap.get(name).setName(newname);
        this.menuHashMap.get(name).setPrice(price);
        this.menuHashMap.get(name).setDesc(desc);
        this.menuHashMap.get(name).setCategory(category);
        return "Sucess";
    }

    public String removeItem(String name){
        this.menuHashMap.remove(name);
        return "Sucess";
    }

    public void printItems(){
        for (Item item : this.menuHashMap.values()){
            System.out.println(item);
        }
    }
}
