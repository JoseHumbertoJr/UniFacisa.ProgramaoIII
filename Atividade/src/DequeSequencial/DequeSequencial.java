package DequeSequencial;

public class DequeSequencial {
	
	private Object [] array = new Object[3];
	private int inseridos;
	
	public void insertFront(Object objeto) {
		if(inseridos == array.length) {
			Object [] novoArray = new Object[array.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = array[i];
			}
			novoArray[0] = objeto;
			array = novoArray;
		}
		else {
			Object [] novoArray = new Object[array.length];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = array[i];
			}
			novoArray[0] = objeto;
			array = novoArray;
		}
		inseridos++;
	}
	
	public void insertLast(Object objeto) {
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
	public Object deleteFront() {
		if(array[0] == null) {
			System.out.println("Campo vazio");
		}
		else {
			for (int i = 0; i < inseridos; i++) {
				array[i] = array[i+1];
			}
			inseridos--;
		}
		return array[0];
	}
	public Object deleteLast() {
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		else {
			array[inseridos-1] = null;
			inseridos--;
		}
		return array[inseridos-1];
	}
	public Object getFront() {
		return array[0];
	}
	public Object getLast(){
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		return array[inseridos-1];
	}
	public int size() {
		return inseridos;
	}
	public boolean isEmpty(){
		return inseridos == 0;
	}
	public void imprime() {
		for (int i = 0; i < inseridos; i++) {
			System.out.println(array[i]);
		}
	}
}
