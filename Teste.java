package estudodejava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		System.out.println(numero + 5);
		
		String numeroConvertidoParaTexto = Integer.toString(numero);
		
		System.out.println(numeroConvertidoParaTexto + 5);
		System.out.println(numero + 5);
		
		sc.close();
	}
}
