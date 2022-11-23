package estudodejava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		// Ler dados do usuario a partir do teclado
		Scanner sc = new Scanner(System.in);
		
		// Pede para que um número seja digitado. Esse número será lido
		// como um string.
		System.out.println("Dígite um numero qualquer: ");
		String numero = sc.next();
		
		// Converte esse número do tipo string para um número do tipo númerico
		int numeroEmTextoConvertidoParaNumerico = Integer.parseInt(numero);
		
		// Um número literal que serve para a somar entre ele e o número digitado pelo usuario
		int umNumeroQualquer = 23;
		
		// Soma o número digitado com o número literal
		int somaDosDoisNumeros = numeroEmTextoConvertidoParaNumerico + umNumeroQualquer;
		
		// Armazena o resultado da soma
		int resultadoSoma = somaDosDoisNumeros;
		
		// Imprime o resultado da soma
		System.out.printf("O resultado da soma entre %d e %d eh: %d.", numeroEmTextoConvertidoParaNumerico, 
		umNumeroQualquer, resultadoSoma);
		
		
		
		// Verifica qual o tipo do dado
		//System.out.println(numero.getClass().getSimpleName());
		//System.out.println(((Object)numero).getClass().getSimpleName());
		
		sc.close();
	}
}
