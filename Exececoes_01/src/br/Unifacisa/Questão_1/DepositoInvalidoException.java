package br.Unifacisa.Quest�o_1;

public class DepositoInvalidoException extends Exception{
	
	public DepositoInvalidoException () {
		super("N�o � possivel realizar esse deposito");
	}
}
