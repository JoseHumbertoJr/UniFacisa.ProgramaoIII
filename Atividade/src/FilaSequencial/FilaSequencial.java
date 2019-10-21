package FilaSequencial;

public class FilaSequencial {
	private Object [] array = new Object[3];
	private int inseridos;
	
	public void enqueue(Object objeto) {
		if(inseridos == array.length) {
			Object [] novoArray = new Object[array.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i] = array[i];
			}
			novoArray[inseridos] = objeto;
			array = novoArray;
		}
		else {
			array[inseridos] = objeto;
		}
		inseridos++;
	}
	public Object dequeue() {
		if(array[0] == null) {
			throw new NullPointerException();
		}
		else {
			for(int i = 0; i < inseridos; i++) {
				array[i] = array[i+1];
			}
			inseridos--;
		}
		return array[0];
	}
	
	public Object getFront() {
		return array[0];
	}
	
	public int size() {
		return inseridos;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	public void imprimir() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(array[i]);
		}
	}
}
