package br.Unifacisa.Questão_1;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;
	
	public float sacar(float valor) throws SaqueInvalidoException {
		if(valor <= 0) {
			throw new SaqueInvalidoException();
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
