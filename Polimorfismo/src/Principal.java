
public class Principal {

	public static void main(String[] args) {

		//instanciando um animal do tipo Cachorro
		Animal animal = new Cachorro();
		animal.Falar();
		
		//mudando o tipo do animal para gato
		animal = new Gato();
		animal.Falar();
		
		//A vari�vel gato � do tipo gato e instancia um gato, o mesmo acontece com o cachorro.
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		//Como o m�todo falar � est�tico eu consigo chamar ele sem precisar colocar oo tipo da classe.
		//O param�tro � a vari�vel a do tipo Animal, dessa forma as classes filho (gato, cachorro) conseguer ser chamadas.
		falar(gato);
		falar(cachorro);
		
		}
	
	public static void falar(Animal a) {
		a.Falar();
		//Se a vari�vel a for do tipo Cachorro n�s for�amos o casting do par�metro a para o tipo Cachorro.
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
