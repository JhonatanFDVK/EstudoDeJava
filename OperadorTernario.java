package estudodejava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("Sua idade eh de %d anos.", idade);
		
		boolean maiorDeIdade = false;
		
		boolean podeBeber = idade >= 18 ? maiorDeIdade = true : maiorDeIdade;
	
		System.out.printf("\nPode beber? %b", podeBeber);
		
		sc.close();
	}
}
