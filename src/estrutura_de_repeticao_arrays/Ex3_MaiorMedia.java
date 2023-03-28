package estrutura_de_repeticao_arrays;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int count = 0;
		
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
						
			if (numero > maior) maior = numero;
			
			count = count + 1;
			
			/*
			 * Aqui a vari�vel MAIOR ser� apresentada toda
			 * vez que a vari�vel for adicionada.
			 */
			//System.out.println("Maior n�mero: " + maior);
			
		}while(count < 5);
		
		/*
		 * Aqui a vari�vel MAIOR ser� apresentada apenas
		 * no final, quando o �ltimo n�mero for adicionado.
		 */
		System.out.println("Maior n�mero: " + maior);
		System.out.println("M�dia: " + (soma/count));
	}

}
