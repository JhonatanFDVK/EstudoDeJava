package estudodejava;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígite um numero qualquer: ");
		String numero = sc.next();
		
		System.out.println(numero + 3);
		
		int numeroEmTextoConvertidoParaNumerico = Integer.parseInt(numero);
		
		int umNumeroQualquer = 23;
		
		int somaDosDoisNumeros = numeroEmTextoConvertidoParaNumerico + umNumeroQualquer;
		
		int resultadoSoma = somaDosDoisNumeros;
		
		System.out.printf("O resultado da soma entre %d e %d eh: %d.", numeroEmTextoConvertidoParaNumerico, 
		umNumeroQualquer, resultadoSoma);
		
		
		
		// Verifica qual o tipo do dado
		//System.out.println(numero.getClass().getSimpleName());
		//System.out.println(((Object)numero).getClass().getSimpleName());
		
		sc.close();
	}
}
