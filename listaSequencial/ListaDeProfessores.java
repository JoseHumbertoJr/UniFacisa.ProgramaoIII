package listaSequencial;

public class ListaDeProfessores {
	
	private String[] arrayDeProfessores = new String[3];
	private int inseridos;
	
	public void inserir(String nome) {
		if(arrayDeProfessores.length == inseridos) {
			String[] novoArray = new String[arrayDeProfessores.length*2];
			for(int i = 0; i <= inseridos-1;i++) {
				novoArray[i] = arrayDeProfessores[i];
			}
			this.arrayDeProfessores = novoArray;
		}
		this.arrayDeProfessores[inseridos] = nome;
		inseridos++;
	}
	
	public int size() {
		return this.inseridos;
	}
	public void imprimeLista() {
		for(int i = 0; i < inseridos;i++) {
			System.out.println(this.arrayDeProfessores[i]);
		}
	}
	public int tamanhoDoArray() {
		return this.arrayDeProfessores.length;
	}
}
