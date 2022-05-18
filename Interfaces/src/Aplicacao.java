
public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciando a public class Rota
		Rota rota = new Rota();
		//Instanciando a public class Ferrari
		Ferrari Ferrari = new Ferrari();
		//Instanciando a public class Fusca com o tipo da Interface Automovel
		//Colocar do tipo Automovel permite o polimorfismo
		Automovel Fusca = new Fusca();
		
		//Gerando a rota com os Automóveis Ferrari e Fusca
		rota.rotaAlmanaque(Ferrari);
		rota.rotaAlmanaque(Fusca);
		
		//Instanciando Vendedor
		Vendedor vendedor = new Vendedor();
		//Intaciando Apartamento
		Apartamento apartamento = new Apartamento();
		
		//Mostrando o preço de dois itens caros, sendo a Ferrari
		//também do tipo Automovel de Interface
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(Ferrari);
		

	}

}
