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
	//INCOMPLETO
	public void addLast(Aluno aluno) {
		if(alunoInicio == null) {
			this.alunoInicio = aluno;
		}
		else {
			Aluno temp = this.alunoInicio;
			while(temp != null) {
				temp = temp.getProximo();
				if(temp !=null) {
					this.alunoInicio.setProximo(temp);
				}
			}
			this.alunoInicio.setProximo(aluno);
		}
	}
	
	public void imprimeLista() {
		while(alunoInicio != null) {
			System.out.println(alunoInicio.getNome());
			alunoInicio = alunoInicio.getProximo();
		}
	}
}
