
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Circunferencia circunferencia = new Circunferencia();
		
		quadrado.setLado(20);
		System.out.println("A �rea do quadrado �: "+ quadrado.CalculaArea());
		
		triangulo.setAltura(10);
		triangulo.setBase(20);
		System.out.println("A �rea do tri�ngulo �: "+ triangulo.CalculaArea());
		
		circunferencia.setRaio(12);
		System.out.println("A �rea da circunfer�ncia �: "+ circunferencia.CalculaArea());
	}

}
