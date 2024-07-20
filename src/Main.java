import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com o seu nome");
        str = texto.nextLine();
        System.out.println("bem vindo "+ str);

        texto.close();



        System.out.println("Hello world!");
    }
}