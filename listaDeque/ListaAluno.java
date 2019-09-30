package listaDeque;

public class ListaAluno {
	
	private Aluno alunoInicio;
	
	public void addFirst(Aluno aluno) {
		if(alunoInicio == null) {
			alunoInicio = aluno;
		}
		else {
			Aluno temp = alunoInicio;
			alunoInicio = aluno;
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
				temp = temp.getProximo();
			}
			temp.setProximo(aluno);
		}
	}
	
	public void imprimeLista() {
		while(this.alunoInicio != null) {
			System.out.println(alunoInicio.getNome());
			alunoInicio = alunoInicio.getProximo();
		}
	}
}
