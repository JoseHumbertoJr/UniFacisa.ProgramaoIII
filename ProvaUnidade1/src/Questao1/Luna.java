package Questao1;

public class Luna {
	
	private String nome;
	private Luna proximo;
	
	public Luna(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Luna getProximo() {
		return proximo;
	}

	public void setProximo(Luna proximo) {
		this.proximo = proximo;
	}
}
