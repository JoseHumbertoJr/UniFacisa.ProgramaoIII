package Questao2;

public class Main {

	public static void main(String[] args) throws ListaLotadaException {
		GonzagaList lista = new GonzagaList();
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(8);
		lista.add(10);
		lista.add(11);
		//lista.remove(7);
		lista.imprimeLista();
		System.out.println("Size: "+lista.getSize());
		
	}

}
