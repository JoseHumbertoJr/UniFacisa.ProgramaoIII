package Questao2;

public class GonzagaList {
	
	private int inseridos;
	private int posicaoPar = 0;
	private int posicaoImpar = 1;
	private Object [] array = new Object[TAMANHO_MAXIMO];
	public static final int TAMANHO_MAXIMO = 10;
	
	public void add(Object objeto) throws ListaLotadaException {
		if(inseridos == TAMANHO_MAXIMO) {
			throw new ListaLotadaException("Lista Lotada !");
		}
		else if(posicaoImpar < TAMANHO_MAXIMO) {
			array[posicaoImpar] = objeto;
			posicaoImpar+=2;
			inseridos++;
		}
		else if(posicaoPar < TAMANHO_MAXIMO){
			array[posicaoPar] = objeto;
			posicaoPar+=2;
			inseridos++;
		}
	}
	
	public void remove(Object objeto) {
		for(int i = 0; i < inseridos; i++) {
			if(array[i] == objeto) {
				array[i] = null;
				if(i % 2 == 0) {
					posicaoPar-=2;
				}
				else {
					posicaoImpar-=2;
				}
				i = inseridos;
			}
		}
		inseridos--;
	}
	
	public void imprimeLista() {
		for(int i = 0; i < inseridos; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public int getSize() {
		return inseridos;
	}
}
