
public class Principal {

	public static void main(String[] args) {

		Animal animal = new Cachorro();
		animal.Falar();
		
		animal = new Gato();
		animal.Falar();
		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		//Como o m�todo falar � est�tico eu consigo chamar ele sem precisar colocar oo tipo da classe.
		//O param�tro � a vari�vel a do tipo Animal, dessa forma as classes filho (gato, cachorro) conseguer ser chamadas.
		//A 
		
		falar(gato);
		falar(cachorro);
		
		}
	
	public static void falar(Animal a) {
		a.Falar();
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
