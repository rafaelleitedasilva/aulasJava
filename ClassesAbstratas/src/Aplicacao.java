
public class Aplicacao {
	public static void main(String[] args) {
		
			//Instanciando a classe abstrata Item e realizando o polimorfismo para outras classes que herdam dela
			Item item = new Cogumelo();
			item.pegar();
			
			item = new Moeda();
			item.pegar();
			
			item = new Diamante();
			item.pegar();
	}

}
