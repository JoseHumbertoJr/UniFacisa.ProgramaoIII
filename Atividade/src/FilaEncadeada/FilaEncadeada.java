package FilaEncadeada;

public class FilaEncadeada {
	
	private Aluno inicio;
	private int inseridos;
	
	public void enqueue(Aluno objeto) {
		if(this.inicio == null) {
			this.inicio = objeto;
		}
		else {
			Aluno temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(objeto);
		}
		inseridos++;
	}
	public Object Dequeue() {
		this.inicio = this.inicio.getProximo();
		inseridos--;
		return this.inicio.getNome();
	}
		
	public int size() {
		return inseridos;
	}
	
	public boolean getReareisEmpty() {
		return inseridos == 0;
	}
	public void imprime() {
		Aluno temp = this.inicio;
		while(temp != null) {
			System.out.println(temp.getNome());
			temp = temp.getProximo();
		}
	}
}
