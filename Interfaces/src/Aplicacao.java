
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
		Automovel Ferrari = new Ferrari();
		Automovel Fusca = new Fusca();
		
		rota.rotaAlmanaque(Ferrari);
		rota.rotaAlmanaque(Fusca);
		

	}

}
