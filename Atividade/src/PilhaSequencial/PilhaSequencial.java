package PilhaSequencial;

public class PilhaSequencial {
	
	private Object [] array = new Object[3];
	private int inseridos;
	
	public void push(Object objeto) {
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
	public Object pop() {
		if(array[0] == null) {
			throw new NullPointerException();
		}
		else {
			array[inseridos-1] = null;
		}
		inseridos--;
		return array[inseridos-1];
	}
	
	public Object top() {
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		return array[inseridos-1];
	}
	
	public int size() {
		return inseridos;
	}
	public void clear() {
		if(inseridos == 0) {
			System.out.println("pilha zerada");
		}
		else {
			for (int i = 0; i < array.length; i++) {
				array[i] = null;
			}
		}
		this.inseridos = 0;
	}
	public void imprimeLista() {
		for(int i = 0; i < inseridos; i++) {
			System.out.println(array[i]);
		}
	}

}
