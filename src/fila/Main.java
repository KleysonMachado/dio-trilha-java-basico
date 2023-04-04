package fila;

public class Main {

	public static void main(String[] args) {

		Fila minhaFila = new Fila();
		//Fila <String> minhaFila = new Fila <>();
		
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("Quarto");
		minhaFila.enqueue(1);
		minhaFila.enqueue(true);
		minhaFila.enqueue(false);
		minhaFila.enqueue("Quinto");
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("último");
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
	}

}
