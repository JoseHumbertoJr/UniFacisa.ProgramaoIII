package br.Unifacisa.Questão_4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

	@Test
	public void toCelsius() throws FahrenheitException {
		Utils teste = new Utils();
		double esperado = teste.toCelsius(56);
		Assert.assertEquals(13.3333, esperado, 0.0002);
	}

}
