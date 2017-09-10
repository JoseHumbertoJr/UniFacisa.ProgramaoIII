package br.Unifacisa.Questão_6;
import br.Unifacisa.Questão_1.SaqueInvalidoException;
import br.Unifacisa.Questão_5.*;


public class Main {
	public static void main(String[] args) throws SaldoInsuficienteExcecao, SaqueInvalidoException {
		ContaCorrente novaConta = new ContaCorrente();
		try {
			novaConta.sacar(50000);
		}
		catch(SaldoInsuficienteExcecao x) {
			System.out.println("Seu Saldo é de :"+novaConta.getSaldo()+"Impossivel Sacar");
			System.out.println(x.getMessage());
		}

	}
}
