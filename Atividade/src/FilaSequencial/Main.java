package FilaSequencial;

public class Main {

	public static void main(String[] args) {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Anderson Silva");
		fila.enqueue("Carol Rosa");
		fila.enqueue("Vitor Belfort");
		fila.enqueue("José Aldo");
		fila.Dequeue();
		System.out.println(fila.getFront());
		System.out.println(fila.size());
	}

}
