package estrutura_de_repeticao;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class Ex4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int quantNumeros;
		System.out.println("Quantidade de n�meros: ");
		quantNumeros = scan.nextInt();
		int numero = 0;
		int quantPares = 0;
		int quantImpares = 0;
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++; // quantPares = quantPares + 1;
			else quantImpares++;
			
			//count = count + 1;
			count++;
		}while(count < quantNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade �mpar: " + quantImpares);
	}

}
