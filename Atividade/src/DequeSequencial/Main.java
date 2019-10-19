package DequeSequencial;

public class Main {

	public static void main(String[] args) {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("Õnibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminhão");
		
		deque.imprime();
	}

}
