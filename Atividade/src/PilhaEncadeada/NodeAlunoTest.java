package PilhaEncadeada;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NodeAlunoTest {

	@Test
	void testPush() {
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		assertEquals("Aleff", node.top());
	}
	@Test
	void testPop() {
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		node.pop();
		assertEquals("Paulo", node.top());
	}
	@Test
	void testTop() {
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		assertEquals("Aleff", node.top());
	}
	@Test
	void testSize() {
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		assertEquals(3, node.size());
	}
	@Test
	void testClear() {
		Aluno vitor = new Aluno("Victor",16124141);
		Aluno paulo = new Aluno("Paulo", 16214214);
		Aluno aleff = new Aluno("Aleff", 16421412);
		
		NodeAluno node = new NodeAluno();
		node.push(vitor);
		node.push(paulo);
		node.push(aleff);
		node.clear();
		assertEquals(0, node.size());
	}

}
