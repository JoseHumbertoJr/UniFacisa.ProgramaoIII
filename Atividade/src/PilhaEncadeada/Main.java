package PilhaEncadeada;

public class Main {
	public static void main(String[] args) {
		
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		node.pop();	
		node.clear();
		node.imprimePilha();
	}
}
