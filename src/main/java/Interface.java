import java.util.Scanner;

public class Interface {
    static Scanner scan = new Scanner(System.in);
    static Cashier Lucas = new Cashier("Lucas");
    static String input = "nada";

    public static void main(String[] args){
        Interface.run();
    }

    public static void run() {

        while ((!input.equals("0"))) {
            System.out.println("Rodando 0 para sair");
            System.out.println("1 Cadastrar item");
            System.out.println("2 Mostrar item");

            input = scan.nextLine();

            if(input.equals("1")){
                String name;
                double price;
                Lucas.registerItem(name = scan.nextLine(), price = scan.nextDouble());
            }

            if(input.equals("2")){
                Lucas.printItems();
            }
        }
    }

    }
