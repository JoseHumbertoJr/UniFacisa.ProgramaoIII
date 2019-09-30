package listaEncadeada;

public class ListaDeAluno {
	
	private Aluno inicio;
	
	public void adicionar(Aluno aluno) {
		if(this.inicio == null) {
			inicio = aluno;
		}
		else {
			Aluno temp = inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(aluno);
		}
	}
	public void adicionarInicio(Aluno aluno) {
		if(this.inicio == null) {
			this.inicio = aluno;
		}
		else {
			Aluno temp = inicio;
			this.inicio = aluno;
			this.inicio.setProximo(temp);
		}
	}
	public void imprimeLista() {
		while(this.inicio != null) {
			System.out.println(this.inicio.getNome());
			this.inicio = this.inicio.getProximo();
		}
	}
}
