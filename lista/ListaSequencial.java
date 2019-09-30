package lista;

public class ListaSequencial {
	
	private Object [] animais = new Object[3];
	private int inseridos;
	
	public void addFirst(Object nome) {
		if(inseridos == 0) {
			animais[inseridos] = nome;
			inseridos++;
		}
		else if(inseridos == animais.length) {
			Object[] novoArray = new Object[animais.length*2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = animais[i];
			}
			animais = novoArray;
			animais[0] = nome;
			inseridos++;
		}
		else {
			Object[] temp = new Object[animais.length];
			for(int i = 1; i <= inseridos;i++) {
				temp[i] = animais[i-1];
			}
			temp[0] = nome;
			animais = temp;
			inseridos++;
		}
	}
	
	public void addLast(Object nome) {
		if(inseridos == animais.length) {
			Object[] novoArray = new Object[animais.length*2];
			for(int i = 0; i < inseridos;i++) {
				novoArray[i+1] = animais[i];
			}
			animais = novoArray;
			animais[0] = nome;
			inseridos++;
		}
		else {
			animais[inseridos] = nome;
			inseridos++;
		}
	}
	
	public int getSize() {
		return inseridos;
	}
	public void imprimeLista() {
		for(int i = 0; i < inseridos;i++) {
			System.out.println(animais[i]);
		}
	}
}
