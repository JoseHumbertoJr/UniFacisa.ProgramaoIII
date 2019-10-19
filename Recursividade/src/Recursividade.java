
public class Recursividade {
	int num = 1;
	int temp = 0;
	
	public Object potencia(int numero, int potencia) {
		if(potencia == 1) {
			return numero;
		}
		if(potencia == 0) {
			return 1;
		}
		if (potencia < 0) {
			return "Operação inválida";
		}
		else if(num < potencia && num == 1) {
			temp+=numero * numero;
			num++;
		}
		else if(num < potencia ) {
			temp = temp * numero;
			num++;
		}
		else if(num == potencia) {
			return temp;
		}
		return potencia(numero, potencia);
	}
}
