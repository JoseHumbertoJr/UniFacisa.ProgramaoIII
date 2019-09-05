package exercicio2Exceptions;

public class ContaCorrente {
	private float limite;
	private float saldo;
	private float valorLimite;
	
	
	public void sacar(float valor) {
		if(valor > saldo) {
			throw new IllegalArgumentException("sem saldo suficiente");
		}
	}
	public void depositar(float valor) throws valorInvalidoException {
		if(valor <= 0) {
			throw new valorInvalidoException("valor inválido");
		}
	}
	public void setValorLimite(float valor) throws valorInvalidoException {
		if(valor <= 0) {
			throw new valorInvalidoException("valor inválido");
		}
	}
}
