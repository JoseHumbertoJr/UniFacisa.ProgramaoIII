package Lista;

public class Node {
	private int inseridos;
	private NodePessoa primeiro;
	
	public Node() {
		this.primeiro = null;
	}
	public String getPrimeiro() {
		return this.primeiro.getNome();
	}
	public String getFinal() {
		NodePessoa novoNo = this.primeiro;
		while(novoNo.proximo != null) {
			novoNo = novoNo.proximo;
		}
		return novoNo.getNome();
	}
	public int getSize() {
		return inseridos;
	}
	public void inserirPrimeiro(String nome) {
		if(this.primeiro == null || this.inseridos == 0) {
			this.primeiro = new NodePessoa(nome);
			inseridos++;
		}
		else {
			NodePessoa aux = this.primeiro;
			primeiro = new NodePessoa(nome);
			primeiro.proximo = aux;
			inseridos++;
			
		}
	}
	public void inserirNoFinal(String nome) {
		if(this.primeiro == null || this.inseridos == 0) {
			this.primeiro = new NodePessoa(nome);
			inseridos++;
		}
		else {
			NodePessoa novoNo = this.primeiro;
			while(novoNo.proximo != null) {
				novoNo = novoNo.proximo;
			}
			novoNo.proximo = new NodePessoa(nome);
			inseridos++;
		}
	}
	public void removerNoFinal() {
		NodePessoa novoNo = this.primeiro;
		for(int i = 0; i < inseridos-2;i++) {
			novoNo = novoNo.proximo;
		}
		novoNo.proximo = null;
		inseridos--;
	}
	public void removerNoInicio() {
		this.primeiro = primeiro.proximo;
		
	}
	
}
