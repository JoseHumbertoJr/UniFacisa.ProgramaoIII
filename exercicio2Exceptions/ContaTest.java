package exercicio2Exceptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.ExpectedExceptionSupport;

class ContaTest {

	@Test
	void testSacar() throws ValorInvalidoException, SaldoInsuficienteException {
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(100);
		conta.sacar(50);
		assertEquals(50.00, conta.getSaldo());
	}
	@Test
	void testDepositar() throws ValorInvalidoException, SaldoInsuficienteException {
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(100);
		assertEquals(100.00, conta.getSaldo());
	}
	@Test
	void testSacarSaldoInsuficiente() throws SaldoInsuficienteException {
	    Assertions.assertThrows(SaldoInsuficienteException.class, () -> {
			ContaCorrente conta = new ContaCorrente();
			conta.depositar(100);
			conta.sacar(150);
	      });
	}
	@Test
	void testValorInvalido() throws ValorInvalidoException {
	    Assertions.assertThrows(ValorInvalidoException.class, () -> {
			ContaCorrente conta = new ContaCorrente();
			conta.depositar(100);
			conta.sacar(-150);
	      });
	}

}
