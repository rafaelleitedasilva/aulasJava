
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo Automovel = new Automovel();
		Veiculo Moto = new Motocicleta();
		Veiculo Onibus = new Onibus();
		
		
		Automovel.Ligar();
		Automovel.isLigado();
		
		Moto.Ligar();
		Moto.isLigado();
		
		Onibus.Desligar();
		Onibus.isLigado();
	}

}
