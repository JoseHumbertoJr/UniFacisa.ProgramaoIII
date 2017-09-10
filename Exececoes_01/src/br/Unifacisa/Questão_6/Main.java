package br.Unifacisa.Quest�o_6;
import br.Unifacisa.Quest�o_1.SaqueInvalidoException;
import br.Unifacisa.Quest�o_5.*;


public class Main {
	public static void main(String[] args) throws SaldoInsuficienteExcecao, SaqueInvalidoException {
		ContaCorrente novaConta = new ContaCorrente();
		try {
			novaConta.sacar(50000);
		}
		catch(SaldoInsuficienteExcecao x) {
			System.out.println("Seu Saldo � de :"+novaConta.getSaldo()+"Impossivel Sacar");
			System.out.println(x.getMessage());
		}

	}
}
