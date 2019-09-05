package temperaturas;

public class TemperatureException extends Exception{
	
	private String mensagem;

	public TemperatureException(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

}
