package PilhaSequencial;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



class PilhaSequencialTest {

	@Test
	void testPush() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		assertEquals("Paulo Martins", pilha.top());
	}
	@Test
	void testPop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		pilha.pop();
		assertEquals("Matheus Souza", pilha.top());
	}
	@Test
	void testTop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		assertEquals("Paulo Martins", pilha.top());
	}
	@Test
	void testSize() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		pilha.pop();
		assertEquals("Matheus Souza", pilha.top());
	}
	@Test
	void testClear() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Claudiano Sampaio");
		pilha.push("Victor Ranniere");
		pilha.push("Aleff Diniz");
		pilha.push("Matheus Souza");
		pilha.push("Paulo Martins");
		pilha.clear();
		assertEquals(0, pilha.size());
	}

}
