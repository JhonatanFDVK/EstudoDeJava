import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Double salario, percentualReajuste, novoSalario;

        System.out.print("SALÁRIO: ");
        salario = input.nextDouble();

        System.out.print("PERCENTUAL DE REAJUSTE: ");
        percentualReajuste = input.nextDouble();

        novoSalario = salario + (salario * percentualReajuste) / 100;

        System.out.print("NOVO SALÁRIO: " + novoSalario);

        input.close();
    }
}
