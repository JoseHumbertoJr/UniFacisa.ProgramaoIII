package Br.UniFacisa.SI;

public class Main {
	public static void main(String[] args) {
		
		Atleta.atleta.setAltura(213);
		System.out.println(Atleta.atleta);
		Atleta.atleta.setAltura(324342);
		System.out.println(Atleta.atleta);
		Atleta.atleta.setAltura(124);
		System.out.println(Atleta.atleta);
		System.out.println("Maior altura: "+Atleta.getMaiorAltura());
	}
}
