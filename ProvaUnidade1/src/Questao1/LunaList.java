package Questao1;

public class LunaList {
	
	private Luna inicio;
	private int inseridos;
	public static final int LIMITE = 30;
	
	public void inserir(Luna luna) throws ListaLotadaException {
		if(inseridos == LIMITE ){
			throw new ListaLotadaException("Lista lotada !");
		}
		else if(inicio == null) {
			this.inicio = luna;
			inseridos++;
		}
		else {
			Luna temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(luna);
			inseridos++;
		}
	}
	public void imprimeLista() {
		Luna temp = this.inicio;
		while(temp != null) {
			System.out.println(temp.getNome());
			temp = temp.getProximo();
		}
	}
	public int size() {
		return inseridos;
	}
}
