package exercicio2Exceptions;

public class SaldoInsuficienteException extends Exception{
	private String mensagem;
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}

	public String getMessage() {
		return super.getMessage();
	}
}
