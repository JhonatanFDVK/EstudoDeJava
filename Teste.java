package estudodejava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String senhaCorreta = "maria123";
		
		System.out.println("Bem Vindo!");
		
		System.out.print("Senha: ");
		String senha = sc.next().trim();
		
		while (true) {
			if (senha.equals(senhaCorreta)) {
				System.out.println("Acesso permitido.");
				break;
			} else {
				System.out.println("Senha incorreta!");
				System.out.print("Senha: ");
				senha = sc.next().trim();
				break;
			}
		}
		
		sc.close();
	}
}
