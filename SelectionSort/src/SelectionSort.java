
public class SelectionSort {
	private int [] array = new int[8];
	private int menor =  0;
	int posicao = 0;
	
	public void inserir(int valor) {
		array[posicao] = valor;
		posicao++;
	}
	
	public void selectionSort() {
		for (int i = 0; i < array.length; i++) {
			menor = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[menor] > array[j]) {
					menor = j;
				}
			}
			if(i != menor) {
				int aux = array[i];
				array[i] = array[menor];
				array[menor] = aux;
			}
		}
	}
	public void imprime() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
