
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciando todas as classes
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Circunferencia circunferencia = new Circunferencia();
		
		//Setando os valores e realizando o calculo com o método da interface no qual foi feito um override
		quadrado.setLado(20);
		System.out.println("A �rea do quadrado �: "+ quadrado.CalculaArea());
		
		triangulo.setAltura(10);
		triangulo.setBase(20);
		System.out.println("A �rea do tri�ngulo �: "+ triangulo.CalculaArea());
		
		circunferencia.setRaio(12);
		System.out.println("A �rea da circunfer�ncia �: "+ circunferencia.CalculaArea());
	}

}
