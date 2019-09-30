package exercicio2Exceptions;

public class Main {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente conta = new ContaCorrente();
		try {
			conta.depositar(50);
			conta.setValorLimite(500);
			conta.sacar(500);
		} 
		catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
	}
	
}
