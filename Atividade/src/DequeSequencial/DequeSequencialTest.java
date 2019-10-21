package DequeSequencial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DequeSequencialTest {
	
	@Test
	void testInsertFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("Õnibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminhão");
		assertEquals("Carreta", deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("Õnibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminhão");
		assertEquals("Caminhão", deque.getLast());
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
		deque.insertFront("Õnibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminhão");
		deque.deleteFront();
		assertEquals("Õnibus", deque.getFront());
		
	}
	@Test
	void testDeleteLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("Õnibus");
		deque.insertFront("Carreta");
		deque.insertLast("Caminhão");
		deque.deleteLast();
		assertEquals("Bicicleta", deque.getLast());
	}
	@Test
	void testSize() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Bicicleta");
		deque.insertFront("Carro");
		deque.insertFront("Õnibus");
		deque.deleteLast();
		assertEquals(2, deque.size());
	}

}
