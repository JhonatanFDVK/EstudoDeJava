import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int idade;
        int somaIdade = 0;
        int quantidadeDigitado = 0;
        double media;

        System.out.print("IDADE: ");
        idade = input.nextInt();

        if (idade < 0) {
            System.out.println("Impossivel  calcular.");
        }

        while (idade >= 0) {
            somaIdade += idade;
            quantidadeDigitado += 1;
            System.out.print("IDADE: ");
            idade = input.nextInt();
        }

        if (quantidadeDigitado != 0) {
            media = (double) somaIdade / quantidadeDigitado;
            System.out.printf("%.2f", media);
        }
        
        input.close();
    }
}