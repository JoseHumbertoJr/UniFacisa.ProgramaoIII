package br.Unifacisa.Programacao3;

public class Deque <T>  {

	private T [] arrayInterno;
	private int posicao;
	
	/**
	 * O construtor passara o tamanho do array interno.
	 * @param valor
	 */
	public Deque(int valor){
		T arrayInterno = (T) new Object[valor];
	}
	
	/**
	 * O metodo vai inserir no inicio do arrayInterno e caso estiver cheio ele lança excecao.
	 * @param objeto
	 * @throws DequeFullException
	 */
	public void inserirnoInicio(T objeto) throws DequeFullException{
		
		if(posicao==arrayInterno.length){
			throw new DequeFullException();
		}
		
		if(arrayInterno[0] == null){
			arrayInterno[0] = objeto;
		}
		else{
			for(int i = 0;i < posicao-1;i++){
				arrayInterno[i+1] = arrayInterno[i];
			}
			arrayInterno[0] = objeto;
			posicao++;
		}
	}
	public void inserirNoFinal(T objeto){
		arrayInterno[posicao] = objeto;
		posicao++;
	}
	/**
	 * O metodo vai remover o primeiro item do arrayInterno caso não tenha elemento ele lanca excecao.
	 * @throws DequeFullException
	 */
	
	public void removerNoInicio() throws DequeFullException{
		if(posicao==0){
			throw new DequeFullException();
		}
		for(int i = 0;i < posicao-1;i++){
			arrayInterno[i] = arrayInterno[i+1];
		}
		arrayInterno[posicao-1] = null;
		posicao--;
	}
	/**
	 * O metodo remove o ultimo elemento do arrayInterno.
	 * @throws DequeFullException
	 */
	public void removerNoFinal() throws DequeFullException{
		if(posicao==0){
			throw new DequeFullException();
		}
		arrayInterno[posicao-1] = null;
		posicao--;
	}
	/**
	 * O metodo retorna o primeiro elemento do arrayInterno.
	 * @return elemento do arrayInterno.
	 */
	public Object first(){
		return arrayInterno[0];
	}
	/**
	 * O metodo retorna o proximo item do arrayInterno.
	 * @return elemento.
	 */
	public Object last(){
		return arrayInterno[posicao];
	}
	
	/**
	 * O metodo vai retornar o ultimo item do arrayInterno. 
	 * @return ultimo elemento.
	 */
	
	public Object size(){
		return arrayInterno[posicao-1];
	}
}
