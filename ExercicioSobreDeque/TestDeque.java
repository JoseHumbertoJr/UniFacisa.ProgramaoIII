package br.Unifacisa.Programacao3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TestDeque {

	@Test
	public void testInserirNoInicio() throws DequeFullException {
		Deque novo = new Deque(3);
		novo.inserirnoInicio("paula");
		Object resultado = novo.first();
		Assert.assertEquals("paula", resultado);
	}
	@Test
	public void testInserirNoFinal() throws DequeFullException{
		Deque novo = new Deque(5);
		novo.inserirNoFinal("felipe");
		Object resultado = novo.size();
		Assert.assertEquals("felipe", resultado);
	}

}
