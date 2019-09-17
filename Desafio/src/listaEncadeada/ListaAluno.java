package listaEncadeada;

public class ListaAluno {
	
	private Aluno alunoInicio;
	
	///IMCOMPLETO
	public void addFirst(Aluno aluno) {
		if(alunoInicio == null) {
			alunoInicio = aluno;
		}
		else {
			Aluno temp = alunoInicio;
			alunoInicio = this.alunoInicio.getProximo();
			alunoInicio.setProximo(temp);
		}
	}
	
	public void addLast(Aluno aluno) {
		if(alunoInicio == null) {
			this.alunoInicio = aluno;
		}
		else {
			Aluno temp = this.alunoInicio;
			while(temp.getProximo() != null) {
				System.out.println(temp.getNome());
				temp = temp.getProximo();
				this.alunoInicio.setProximo(temp);
			}
			this.alunoInicio.setProximo(aluno);
		}
	}
	
	public void imprimeLista() {
		while(alunoInicio.getProximo() != null) {
			System.out.println(alunoInicio.getNome());
			alunoInicio = alunoInicio.getProximo();
		}
	}
}
