package br.Unifacisa.Quest�o_2;
import java.util.Scanner;

import br.Unifacisa.Quest�o_1.*;

public class Main {
	public static void main(String[]args) throws Throwable{
		ContaCorrente novaConta = new ContaCorrente();
		try {
			Scanner teclado = new Scanner(System.in);			
			float numero = teclado.nextFloat();
			novaConta.depositar(numero);
			novaConta.sacar(-5);
		}
		catch(DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		catch(SaqueInvalidoException f) {
			System.out.println(f.getMessage());
		}
	}
}
