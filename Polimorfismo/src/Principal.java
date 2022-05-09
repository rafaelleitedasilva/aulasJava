
public class Principal {

	public static void main(String[] args) {

		Animal animal = new Cachorro();
		animal.Falar();
		
		animal = new Gato();
		animal.Falar();
		
		//A variável gato é do tipo gato e instancia um gato, o mesmo acontece com o cachorro.
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		//Como o método falar é estático eu consigo chamar ele sem precisar colocar oo tipo da classe.
		//O paramêtro é a variável a do tipo Animal, dessa forma as classes filho (gato, cachorro) conseguer ser chamadas.
		falar(gato);
		falar(cachorro);
		
		}
	
	public static void falar(Animal a) {
		a.Falar();
		//Se a variável a for do tipo Cachorro nós forçamos o casting do parâmetro a para o tipo Cachorro.
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
