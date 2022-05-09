
public class Aplicacao {

	public static void main(String[] args) {
		
		Bebida refri = new Refrigerante("Coca",false);
		Preparador barman = new Preparador();
		Bebida leite = new LeiteQuente(true);
		
		leite.prepara();
		refri.prepara();
		
		barman.prepararBebida(refri);
		barman.prepararBebida(leite);
	}

}
