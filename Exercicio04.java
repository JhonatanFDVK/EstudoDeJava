import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int anosDeVida, mesesDeVida, diasDeVida;

        System.out.print("DIGITE SEUS ANOS DE VIDA: ");
        anosDeVida = input.nextInt();

        System.out.print("DIGITE SEUS MESES DE VIDA: ");
        mesesDeVida = input.nextInt();

        System.out.print("DIGITE SEUS DIAS DE VIDA: ");
        diasDeVida = input.nextInt();

        System.out.println("IDADE EXPRESSA APENAS EM DIAS.");

        int anosDias = anosDeVida * 365;
        int mesesDias = mesesDeVida * 30;
        int totalDeDias = anosDias + mesesDias + diasDeVida;

        System.out.println("IDADE TOTAL EXPRESSA APENAS EM DIAS: " + totalDeDias);

        input.close();

    }
}
