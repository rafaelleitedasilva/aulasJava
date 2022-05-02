
public class Contador {

	private static int valor = 1;
	public static void incrementar() {
		valor ++;
		
	}
	
	static {
		valor = 1;
	}
	
//	public Contador() {
//		valor = 1;
//	}


	public static int getValor() {
		return valor;
	}

	public static void setValor(int valor1) {
		valor = valor1;
	}
	
	
}
