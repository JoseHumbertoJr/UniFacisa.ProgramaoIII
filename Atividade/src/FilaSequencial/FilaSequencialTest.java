package FilaSequencial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaSequencialTest {

	@Test
	void testEnqueue() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Anderson Silva");
		fila.enqueue("Carol Rosa");
		fila.enqueue("Vitor Belfort");
		fila.enqueue("José Aldo");
		assertEquals("Anderson Silva", fila.getFront());
	}
	@Test
	void testDequeue() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Anderson Silva");
		fila.enqueue("Carol Rosa");
		fila.enqueue("Vitor Belfort");
		fila.enqueue("José Aldo");
		fila.dequeue();
		assertEquals("Carol Rosa", fila.getFront());
	}
	@Test
	void testIsEmpty() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Anderson Silva");
		fila.enqueue("Carol Rosa");
		fila.enqueue("Vitor Belfort");
		fila.enqueue("José Aldo");
		assertEquals(false, fila.isEmpty());
	}
	@Test
	void testSize() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Anderson Silva");
		fila.enqueue("Carol Rosa");
		fila.enqueue("Vitor Belfort");
		fila.enqueue("José Aldo");
		assertEquals(4, fila.size());
	}

}
