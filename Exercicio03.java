import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int base, altura;

        System.out.print("BASE: ");
        base = input.nextInt();
        System.out.print("ALTURA: ");
        altura = input.nextInt();

        int area = base * altura;

        System.out.println("ARÉA DO RETÂNGULO: " + area);

        input.close();

    }
    
}
