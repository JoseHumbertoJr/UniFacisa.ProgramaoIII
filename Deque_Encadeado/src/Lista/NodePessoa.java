package Lista;

public class NodePessoa {
	
	private String nome;
	protected NodePessoa proximo;
	
	public NodePessoa(String nome) {
		this.nome = nome;
		this.proximo = null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NodePessoa getProximo() {
		return this.proximo;
	}
}
