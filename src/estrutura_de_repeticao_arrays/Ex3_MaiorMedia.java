package estrutura_de_repeticao_arrays;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
						
			if (numero > maior) maior = numero;
			
			count = count + 1;
			
			/*
			 * Aqui a variável MAIOR será apresentada toda
			 * vez que a variável for adicionada.
			 */
			//System.out.println("Maior número: " + maior);
			
		}while(count < 5);
		
		/*
		 * Aqui a variável MAIOR será apresentada apenas
		 * no final, quando o último número for adicionado.
		 */
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + (soma/count));
	}

}
