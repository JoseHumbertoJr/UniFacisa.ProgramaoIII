package br.Unifacisa.Questão_1;

public class DepositoInvalidoException extends Exception{
	
	public DepositoInvalidoException () {
		super("Não é possivel realizar esse deposito");
	}
}
