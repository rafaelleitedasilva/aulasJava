package heran�a2D3D;

public class Aplicacao {

	public static void main(String[] args) {

		//Instanciando as classes
		Ponto2D ponto2D = new Ponto2D(2,3);
		Ponto2D ponto3D = new Ponto3D(10,5,2);
	
		//Mostrando os atributos formatados
		System.out.println(ponto2D.toString());
		System.out.println(ponto3D.toString());

	}

}
