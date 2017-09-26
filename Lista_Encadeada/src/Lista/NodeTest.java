package Lista;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testInserirPrimeiro() {
		Node no = new Node();
		no.inserirPrimeiro("pastor");
		no.inserirPrimeiro("front-end");
		assertEquals("front-end", no.getPrimeiro());
	}
	@Test
	public void testInserirPrimeiro2() {
		Node no = new Node();
		no.inserirPrimeiro(null);
	
		assertEquals(null, no.getPrimeiro());
	}
	@Test (expected=NullPointerException.class)
	public void testInserirPrimeiro3() {
		Node no = new Node();
		assertEquals(null, no.getPrimeiro());
	}
	@Test
	public void testInserirPrimeiro4() {
		Node no = new Node();
		no.inserirPrimeiro("");
	
		assertEquals("", no.getPrimeiro());
	}
	@Test
	public void testInserirNoFinal() {
		Node no = new Node();
		no.inserirNoFinal("paula");
		assertEquals("paula", no.getFinal());
	}
	@Test 
	public void testRemoverNoFinal() {
		Node no = new Node();
		no.inserirPrimeiro("paula");
		no.inserirPrimeiro("paulo raivozo");
		no.inserirPrimeiro("felipe quer paz");
		no.removerNoFinal();
		assertEquals("paulo raivozo", no.getFinal());
	}
	
	@Test 
	public void testRemoverNoIncio() {
		Node no = new Node();
		no.inserirPrimeiro("paulo");
		no.inserirPrimeiro("pastor");
		no.inserirPrimeiro("raca negra");
		no.removerNoInicio();
		assertEquals("pastor", no.getPrimeiro());
	}

}
