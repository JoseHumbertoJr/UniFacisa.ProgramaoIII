package Br.UniFacisa.SI;

public class Atleta {
	
	// Aqui se consegue acessar a classe no mesmo espaço de memoria sem instanciar
	public static Atleta atleta = new Atleta();
	
	private static double MAIOR_ALTURA = 1.0;
	
	public void setAltura(double altura) {
		if(altura > MAIOR_ALTURA) {
			MAIOR_ALTURA = altura;
			System.out.println("Superou a altura");
		}
		else {
			System.out.println("Não superou a altura");
		}
	}
	
	public static double getMaiorAltura() {
		return MAIOR_ALTURA;
	}
	/**
	 * Este padrão oferece um ponto de acesso global, assim como uma variável global, 
	   porém sem as desvantagens das variáveis globais.
	 */
}
