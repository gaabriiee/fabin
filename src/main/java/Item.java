public class Item {
    String name;
    double price;
    String desc;
    String category;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
