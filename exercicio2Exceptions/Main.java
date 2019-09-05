package exercicio2Exceptions;

public class Main {
	
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		try {
			conta.depositar(50);
			conta.setValorLimite(500);
			conta.sacar(500);
		} 
		catch (valorInvalidoException e) {
			e.printStackTrace();
		}
	}
	
}
