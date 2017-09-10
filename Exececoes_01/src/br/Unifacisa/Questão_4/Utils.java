package br.Unifacisa.Questão_4;

public class Utils {
	private static final int NOVE = 9;
	private static final int CINCO = 5;
	private static final int TRINTA_E_DOIS = 32;
	
	public double toCelsius(double tempFahrenheit ) throws FahrenheitException {
		double formula = 0.0;
		if(tempFahrenheit < 0) {
			throw new FahrenheitException();
		}
		else {
			formula = ((CINCO*(tempFahrenheit-TRINTA_E_DOIS))/NOVE);
		}
		return formula;
	}
}
