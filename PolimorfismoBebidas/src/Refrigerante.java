
public class Refrigerante extends Bebida{

	//Construtor do Refrigerante
	public Refrigerante(String nome, boolean quente) {
		super(nome, quente);
	}

	//Override do método prepara que na classe principal está vazio
	@Override
	public void prepara() {
		System.out.println("Pega a garrafa de refrigerante");
		System.out.println("Adiciona gelo ao copo!");
	}
	
	

}
