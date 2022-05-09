
public class Refrigerante extends Bebida{

	public Refrigerante(String nome, boolean quente) {
		super(nome, quente);
	}

	@Override
	public void prepara() {
		System.out.println("Pega a garrafa de refrigerante");
		System.out.println("Coloca o refrigerante em um copo");
		System.out.println("Adiciona gelo ao copo!");
		System.out.println("");
	}
	
	

}
