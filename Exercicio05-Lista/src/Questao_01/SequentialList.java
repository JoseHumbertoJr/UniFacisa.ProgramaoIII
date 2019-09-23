package Questao_01;

public class SequentialList {
	
	private Object [] array = new Object [13];
	private int inseridos = 0;
	
	public void insercaoNoInicio(int numero) {
		
		if(inseridos == array.length) {
			Object [] novoArray = new Object[array.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = array[i];
			}
			array = novoArray;
			array = novoArray;
			inseridos++;
		}
		else {
			Object [] novoArray = new Object[array.length];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i+1] = array[i];
			}
			novoArray[0] = numero;
			array = novoArray;
			inseridos++;
		}

	}
	
	public void inserirNoFim(int numero) {
		if(inseridos == array.length) {
			Object [] novoArray = new Object[array.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i] = array[i];
			}
			array = novoArray;
		}
		array[inseridos] = numero;
		inseridos++;
	}
	
	public void impressao() {
		for(int i = 0; i < inseridos;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
