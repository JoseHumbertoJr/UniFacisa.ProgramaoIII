
public class Main {

	public static void main(String[] args) {
		
		SelectionSort select = new SelectionSort();
		select.inserir(9);
		select.inserir(25);
		select.inserir(10);
		select.inserir(18);
		select.inserir(5);
		select.inserir(7);
		select.inserir(15);
		select.inserir(3);
		
		select.selectionSort();
		select.imprime();
		
	}

}
