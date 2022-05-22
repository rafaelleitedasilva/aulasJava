
public class LeiteQuente extends Bebida {

	//Como "não" tem diferentes tipos de leite, nós não colocamos o seu nome, pois sempre será leite
	public LeiteQuente(boolean quente) {
		super("leite", quente);
		// TODO Auto-generated constructor stub
	}

	//Outro override de prepara
	@Override
	public void prepara() {
		System.out.println("Pegar a caixa de leite");
		System.out.println("Passar para o preparador!");
	}

	
}
