package exercicio2Exceptions;

public class ValorInvalidoException extends Exception {
	
	private String mensagem = "valor inválido";
	
	public ValorInvalidoException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}
	
	public String getMessage() {
		return mensagem;
	}
	
}
