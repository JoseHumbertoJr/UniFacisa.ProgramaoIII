package Br.UniFacisa.SI;

public class Atleta {
	
	// Aqui se consegue acessar a classe no mesmo espa�o de memoria sem instanciar
	public static Atleta atleta = new Atleta();
	
	private static double MAIOR_ALTURA = 1.0;
	
	public void setAltura(double altura) {
		if(altura > MAIOR_ALTURA) {
			MAIOR_ALTURA = altura;
			System.out.println("Superou a altura");
		}
		else {
			System.out.println("N�o superou a altura");
		}
	}
	
	public static double getMaiorAltura() {
		return MAIOR_ALTURA;
	}
	/**
	 * Este padr�o oferece um ponto de acesso global, assim como uma vari�vel global, 
	   por�m sem as desvantagens das vari�veis globais.
	 */
}
