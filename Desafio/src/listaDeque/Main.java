package listaDeque;

public class Main {
	public static void main(String[] args) {
		Aluno aleff = new Aluno("Aleff",16412343);
		Aluno paulo = new Aluno("Paulo",16145355);
		Aluno vito = new Aluno("Victor",1614314324);
		Aluno jose = new Aluno("José",1613081092);
		
		ListaAluno lista = new ListaAluno();
		lista.addFirst(aleff);
		lista.addFirst(paulo);
		lista.addFirst(vito);
		lista.addLast(jose);
		lista.imprimeLista();
	}
}
