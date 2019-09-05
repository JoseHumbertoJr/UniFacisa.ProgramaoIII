package temperaturas;

public class Main {
	public static void main(String[] args) throws FahrenheitException {
		
		Utils conversao = new Utils();
		conversao.toCelsius(-800);
		System.out.println(conversao.getTemperaturaCelsius());
	}
}
