
public class LeiteQuente extends Bebida {

	public LeiteQuente(boolean quente) {
		super("leite", quente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepara() {
		System.out.println("Pegar a caixa de leite");
		System.out.println("Colocar o leite no copo");
		System.out.println("Passar para o preparador!");
		System.out.println("");
	}

	
}
