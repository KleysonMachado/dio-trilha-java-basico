/*
====================================================
Desafios B�sicos - Banco PAN Java Developer
====================================================
3/5 - Soma de H com N Termos
====================================================
Desafio
Neste desafio, fa�a um programa que calcule o valor de H com N termos. 
Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
Entrada 
A entrada consiste em um n�mero inteiro positivo. 
Sa�da 
Na sa�da ser� impresso o valor que representa a soma dos termos.
-------------------
| Entrada | Sa�da |
-------------------
| 4       | 2     |
-------------------
| 8       | 3     |
-------------------
| 3       | 2     |
-------------------
SOLU��O ABAIXO: */

package desafio_SomadeH;

import java.util.Scanner;

public class SumHWithNTerms {

	  public static void main(String[] Args) {

	    double h = 0;
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    for (double i = 1; i <= n; i++) {
	      h += 1/i;
	    }
	    
	    System.out.println(Math.round(h));

	    sc.close();

	  }
	}
