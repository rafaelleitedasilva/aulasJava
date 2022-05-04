
public class Carro extends Veiculo {

	private boolean quatroPortas;

	
	
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.printf("É quatro portas? %b%n%n", quatroPortas);
	}


	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
