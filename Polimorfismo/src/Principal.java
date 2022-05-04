
public class Principal {

	public static void main(String[] args) {
		
//		Gato gato = new Gato();
		//Generic class
		Animal animal = new Cachorro();
//		Cachorro cao = new Cachorro();		
//		gato.Falar();
//		cao.Falar();
//		cao.Morder();
		animal.Falar();
		
//		Poliformism
		animal = new Gato();
		animal.Falar();
		
	}

}
