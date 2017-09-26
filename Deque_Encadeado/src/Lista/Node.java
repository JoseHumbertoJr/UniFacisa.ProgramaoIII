package Lista;

public class Node {
	
	/**
	 * tamanho do deque
	 */
	private int inseridos;
	/**
	 * primeiro elemento do no.
	 */
	private NodePessoa primeiro;
	
	/**
	 * o primeiro começa sempre como nulo.
	 */
	public Node() {
		this.primeiro = null;
	}
	
	/**
	 * 
	 * @return o primeiro elemento do no.
	 */
	public String getPrimeiro() {
		return this.primeiro.getNome();
	}
	/**
	 * 
	 * @return o elemento final do no.
	 */
	public String getFinal() {
		NodePessoa novoNo = this.primeiro;
		while(novoNo.proximo != null) {
			novoNo = novoNo.proximo;
		}
		return novoNo.getNome();
	}
	/**
	 * size
	 * @return quatidade de nos.
	 */
	public int getSize() {
		return inseridos;
	}
	
	/**
	 * inseri o primeiro no.
	 * @param nome
	 */
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
	/**
	 * inseri no inicio do no.
	 * @param nome
	 */
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
	/**
	 * remove o final do no.
	 */
	public void removerNoFinal() {
		NodePessoa novoNo = this.primeiro;
		for(int i = 0; i < inseridos-2;i++) {
			novoNo = novoNo.proximo;
		}
		novoNo.proximo = null;
		inseridos--;
	}
	/**
	 * remove o inicio do no.
	 */
	public void removerNoInicio() {
		this.primeiro = primeiro.proximo;
		inseridos--;
		
	}
	
}
