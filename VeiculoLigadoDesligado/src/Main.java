
public class Main {

	public static void main(String[] args) {
		//Intanciando os diferentes tipos de automóveis
		Veiculo Automovel = new Automovel();
		Veiculo Moto = new Motocicleta();
		Veiculo Onibus = new Onibus();
		
		//Ligando e mostrando o estado do Automovel
		Automovel.Ligar();
		Automovel.isLigado();
		
		//Fazendo o mesmo com a moto e ônibus
		Moto.Ligar();
		Moto.isLigado();
		
		Onibus.Desligar();
		Onibus.isLigado();
	}

}
