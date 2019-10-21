package DequeSequencial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DequeSequencialTest {
	
	@Test
	void testInsertFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("�nibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminh�o");
		assertEquals("Carreta", deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("�nibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminh�o");
		assertEquals("Caminh�o", deque.getLast());
	}
	@Test
	void testIsEmpty() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		assertEquals(false, deque.isEmpty());
	}
	@Test
	void testDeleteFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("�nibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminh�o");
		deque.deleteFront();
		assertEquals("�nibus", deque.getFront());
		
	}
	@Test
	void testDeleteLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("�nibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminh�o");
		deque.deleteLast();
		assertEquals("Bicicleta", deque.getLast());
	}
	@Test
	void testSize() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("�nibus");
		deque.deleteLast();
		assertEquals(2, deque.size());
	}

}
