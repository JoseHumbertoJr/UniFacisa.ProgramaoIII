package br.Unifacisa.Quest�o_5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.Unifacisa.Quest�o_1.SaqueInvalidoException;

public class ContaCorrenteTest {

	@Test
	public void sacar() throws SaldoInsuficienteExcecao, SaqueInvalidoException {
		ContaCorrente novaConta = new ContaCorrente();
		float esperado = novaConta.sacar(500);
		Assert.assertEquals(500, esperado, 0.0002);
		
	}

}
