package br.cesed.si.p3.ed.lista.sequencial;

import org.junit.Assert;
import org.junit.Test;

public class ListaSequencialTest {

	@Test
	public void tamanho1() {
			ListaSequencial<String> ls = new ListaSequencial<>();
			Assert.assertEquals(0, ls.tamanho());
	}

	//
	@Test
	public void inserir1() {	
			ListaSequencial<String> ls = new ListaSequencial<String>();
			ls.inserir("Zé");
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void inserir2() {	
			ListaSequencial<Double> ls = new ListaSequencial<>();
			ls.inserir(2.0);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void inserir3() {	
			ListaSequencial <Double> ls = new ListaSequencial<>();
			ls.inserir(0.1);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void excluir1() throws InvalidObjectException {	
			ListaSequencial<Double> ls = new ListaSequencial<>();
			ls.inserir(1.0);
			ls.inserir(2.0);
			
			ls.excluir(1.0);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void excluir2() throws InvalidObjectException {	
			ListaSequencial<Long> ls = new ListaSequencial<>();
			ls.inserir(300000000L);
			ls.inserir(200000000L);
			ls.excluir(300000000L);
			
			Assert.assertEquals(1, ls.tamanho());
	}
	
	@Test
	public void excluir3() throws InvalidObjectException {	
			ListaSequencial <String> ls = new ListaSequencial<>();
			ls.inserir("Antonio");
			ls.inserir("João");
			ls.excluirPorPosicao(0);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test()
	public void excluir4() throws InvalidObjectException {	
			ListaSequencial <String> ls = new ListaSequencial<>();
			ls.inserir("Zé");
			ls.inserir("Maria");
			ls.inserir("Mari");
			
			ls.excluirPorPosicao(1);
			
			Assert.assertEquals(2, ls.tamanho());
	}
	
}
