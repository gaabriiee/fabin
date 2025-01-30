public class fabin {

    public static void main(String[] args) {
//        Test here
        Store Loja = new Store();

        Loja.registerItem("Cebola", 2.99);
        Loja.registerItem("Cenourinha", 4.20);

        Loja.printItems();

        Loja.removeItem("Cenourinha");
        Loja.editItem("Cebola", "Cebola", 1.99);

        Loja.printItems();
    }
}
