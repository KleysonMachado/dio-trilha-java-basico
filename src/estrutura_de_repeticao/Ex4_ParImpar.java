package estrutura_de_repeticao;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int quantNumeros;
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		int numero = 0;
		int quantPares = 0;
		int quantImpares = 0;
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++; // quantPares = quantPares + 1;
			else quantImpares++;
			
			//count = count + 1;
			count++;
		}while(count < quantNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Ímpar: " + quantImpares);
	}

}
