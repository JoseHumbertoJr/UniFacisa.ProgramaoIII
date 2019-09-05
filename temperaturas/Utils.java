package temperaturas;

public class Utils {
	
	private double temperaturaCelsius;
	
	public void toCelsius(double temperatura) throws FahrenheitException {
		if(((temperatura - 32)*5)/9 < -459.67) {
			throw new FahrenheitException("O flamengo é show");
		}
		else {
			this.temperaturaCelsius= ((temperatura - 32)*5)/9;
		}
	}
	public double getTemperaturaCelsius() {
		return temperaturaCelsius;
	}
}
