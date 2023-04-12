/*
====================================================
Desafios B�sicos - Banco PAN Java Developer
====================================================
1/5 - F�brica de Carros
====================================================
Desafio
O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). O gerente de uma loja de carros gostaria de um programa para calcular o pre�o de um carro novo para os clientes. Voc� receber� o custo de f�brica e as porcentagens referentes ao distribuidor e os impostos e dever� escrever programa para ler esses valores e imprimir o valor final do carro.
Entrada
Voc� recebera tr�s valores inteiros que representam o custo de f�brica, as porcentagens do distribuidor e os impostos.
Sa�da
Como sa�da, teremos o valor final do pre�o de um carro novo.
Exemplo 1
-------------------
| Entrada | Sa�da |
-------------------
| 20000   | 34600 |
| 28      |       |
| 45      |       |
-------------------
Exemplo 2
-------------------
| Entrada | Sa�da |
-------------------
| 30000   | 36000 |
| 10      |       |
| 10      |       |
-------------------
SOLU��O ABAIXO: */

package desafio_FabricadeCarros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
      int custoFabrica = scan.nextInt();
	    int percentualDistribuidor = scan.nextInt();
	    int percentualImpostos = scan.nextInt();
	    
      int custoConsumidor;

      custoConsumidor = ((percentualDistribuidor + percentualImpostos + 100) * custoFabrica) / 100;

      System.out.println(custoConsumidor);
      
      scan.close();
	}

}
