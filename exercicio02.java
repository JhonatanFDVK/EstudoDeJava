import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int antecessor = valor - 1;

        System.out.println("Antecessor de " + valor + " : " + antecessor);

        input.close();
        
    }
}
