package exercicio2Exceptions;

public class valorInvalidoException extends Exception {
	
	private String mensagem = "valor inválido";
	
	public valorInvalidoException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}
	
	public String getMessage() {
		return mensagem;
	}
	
}
