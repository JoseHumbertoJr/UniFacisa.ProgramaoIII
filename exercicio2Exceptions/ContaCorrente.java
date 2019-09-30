package exercicio2Exceptions;

public class ContaCorrente {
	private float limite;
	private float saldo;
	private float valorLimite;
	
	
	public void sacar(float valor) throws SaldoInsuficienteException, ValorInvalidoException {
		if(valor > saldo) {
			throw new SaldoInsuficienteException("Sem saldo Suficiente!!!");
		}
		else if (valor <= 0) {
			throw new ValorInvalidoException("Valor Inv�lido!");
		}
		else {
			this.saldo-=valor;
		}
	}
	public void depositar(float valor) throws ValorInvalidoException {
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor inv�lido!");
		}
		else {
			this.saldo+=valor;
		}
	}
	public void setValorLimite(float valor) throws ValorInvalidoException {
		if(valor <= 0) {
			throw new ValorInvalidoException("valor inv�lido");
		}
	}
	public float getSaldo() {
		return saldo;
	}
}
