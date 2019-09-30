package Questao1;

public class Main {

	public static void main(String[] args) throws ListaLotadaException {
		Luna adriano = new Luna("Adriano Luna");
		Luna felipe = new Luna("Felipe Luna");
		Luna claudiano = new Luna("Claudiano Luna");
		Luna matheus = new Luna("Matheus Luna");
		Luna paulo = new Luna("Paulo Luna");
		Luna leandro = new Luna("Leandro Luna");
		
		LunaList list = new LunaList();
		list.inserir(adriano);
		list.inserir(felipe);
		list.inserir(claudiano);
		list.inserir(matheus);
		list.inserir(paulo);
		list.inserir(leandro);
		list.inserir(new Luna("Robinho Luna"));
		list.imprimeLista();
		
		System.out.println(list.size());
		
		
	}
	
}
