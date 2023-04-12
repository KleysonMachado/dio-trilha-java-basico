/*
====================================================
Desafios B�sicos - Banco PAN Java Developer
====================================================
2/5 - Imprimindo Positivos e M�dia
====================================================
Desafio
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na pr�xima linha, deve-se mostrar a m�dia de todos os valores positivos digitados, com um d�gito ap�s o ponto decimal.
Entrada
A entrada cont�m 6 n�meros que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ). Pelo menos um destes n�meros ser� positivo.
Sa�da
O primeiro valor de sa�da � a quantidade de valores positivos. A pr�xima linha deve mostrar a m�dia dos valores positivos digitados.
--------------------------------------------
| Entrada de Entrada | Exemplo de Sa�da    |
--------------------------------------------
| 7                  | 4 valores positivos |
| -5                 | 7.4                 |
| 6                  |                     |
| -3.4               |                     |
| 4.6                |                     |
| 12                 |                     |
--------------------------------------------
SOLU��O ABAIXO: */

package desafio_PositivosMedia;

import java.io.IOException;
import java.util.Scanner;

public class PositivesAndAverages {
	
	  public static void main(String[] args) throws IOException {
	    Scanner leitor = new Scanner(System.in);
	    int cont = 0;
	    double soma = 0d;
	    double media = 0d;
	     
	    for (int i = 0; i<6; i++) {
	      double x = leitor.nextDouble();
	      if (x > 0) {
	        soma += x;
	        cont++;
	      }
	    }
	        
	    media = soma / cont;
	    
	    System.out.println(cont + " valores positivos");
	    System.out.println(String.format("%.1f", media));
	        
	    leitor.close();
	    
	  }
		
	}
