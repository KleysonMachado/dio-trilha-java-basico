/*
====================================================
Desafios B�sicos - Banco PAN Java Developer
====================================================
5/5 - Fibonacci F�cil
====================================================
Desafio
A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.
Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).
Sa�da
Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o ap�s o �ltimo valor.
-----------------------------------------
| Exemplo de Entrada | Exemplo de Sa�da |
-----------------------------------------
| 5                  | 0 1 1 2 3        |
-----------------------------------------
Agradecimentos a C�ssio F.
SOLU��O ABAIXO: */

package desafio_Fibonacci;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EasyFibonacci {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        
        int[] fib = new int[n];
        
        for (int i = 0; i < n; i++) {
          if (i > 1) {
            fib[i] = fib[i-1] + fib[i-2];
          }
          else if(i == 0 || i == 1) fib[i] = i;
        }
        
        System.out.print(Arrays.toString(fib).replaceAll("(\\[|\\]|,)",""));
        
        leitor.close();
    }
}
