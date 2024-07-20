import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com o seu nome");
        str = texto.nextLine();
        System.out.println("bem vindo "+ str);


        System.out.println("Digite um número. ");
        int numero = texto.nextInt();
        System.out.println("O número digitado foi: " + numero);

        System.out.println("Hello world!");
        texto.close();
    }
}