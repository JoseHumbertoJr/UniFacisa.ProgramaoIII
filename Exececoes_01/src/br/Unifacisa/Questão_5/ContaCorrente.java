package br.Unifacisa.Questão_5;

import br.Unifacisa.Questão_1.*;


public class ContaCorrente {

	private float limite;
	private static float saldo = 1000;
	private float valorLimite;
	
	public float getSaldo() {
		return saldo;
	}
	
	public float sacar(float valor) throws SaqueInvalidoException,SaldoInsuficienteExcecao {
		if(valor <= 0) {
			throw new SaqueInvalidoException();
		}
		else if(valor > saldo) {
			throw new SaldoInsuficienteExcecao();
		}
		else {
			this.saldo-=valor;
		}
		return saldo;
	}
	public float depositar(float valor) throws DepositoInvalidoException {
		if(valor <= 0 ) {
			throw new DepositoInvalidoException();
		}
		else {
			this.saldo+=valor;
		}
		return saldo;
	}
	
	public void setValorLimite(float valorLimite) {
		this.valorLimite = valorLimite;
	}
	
}