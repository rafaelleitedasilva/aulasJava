
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
		Ferrari Ferrari = new Ferrari();
		Automovel Fusca = new Fusca();
		
		rota.rotaAlmanaque(Ferrari);
		rota.rotaAlmanaque(Fusca);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(Ferrari);
		

	}

}
