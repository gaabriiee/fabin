import java.util.Scanner;

public class Interface {
    static Scanner scan = new Scanner(System.in);
    Cashier Lucas = new Cashier("Lucas");
    static String input;

    public static void main(String[] args){
        Interface.run();
    }

    public static void run() {
        System.out.println("Rodando 0 para sair");
        System.out.println("1 Cadastrar item");
        System.out.println("2 Mostrar item");
        while ((input = scan.nextLine()).equals("0")) {
            System.out.println("Saiu pae");
        }
    }

    }
