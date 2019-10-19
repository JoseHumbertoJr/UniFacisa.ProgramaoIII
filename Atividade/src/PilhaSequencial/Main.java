package PilhaSequencial;

public class Main {

	public static void main(String[] args) {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		pilha.pop();
		pilha.imprimeLista();
		System.out.println(pilha.top());
	}

}
