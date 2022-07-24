package heranca2D3D;

public class Aplicacao {

	public static void main(String[] args) {

		//Instanciando as classes ponto2d e ponto3d
		Ponto2D ponto2D = new Ponto2D(2,3);
		//o ponto2d a gente instancia utilizando dois parametros
		//e o ponto3d a gente instancia utilizando tres parametros
		//esses contrutores foram criados em cada classe com base em suas especificacoes
		Ponto2D ponto3D = new Ponto3D(10,5,2);
	
		//Mostrando os atributos formatados por meio do tostring
		System.out.println(ponto2D.toString());
		System.out.println(ponto3D.toString());

	}

}
