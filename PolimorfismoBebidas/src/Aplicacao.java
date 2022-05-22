
public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciando diferentes bebidas
		Bebida refri = new Refrigerante("Fanta-Uva",false);
		Preparador barman = new Preparador();
		Bebida leite = new LeiteQuente(true);

		//Preparando as bebidas com o objeto barman do tipo Preparador
		barman.prepararBebida(refri);
		barman.prepararBebida(leite);
	}

}
