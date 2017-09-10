package br.Unifacisa.Questão_1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void TestContaConrente() throws DepositoInvalidoException {
		ContaCorrente novaConta = new ContaCorrente();
		float resultado = novaConta.depositar(-1);
		Assert.assertEquals(0.0, resultado, 0.0002);
		
		
	}

}
