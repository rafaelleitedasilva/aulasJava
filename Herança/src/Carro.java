
public class Carro extends Veiculo {

	//Atributo único do carro
	private boolean quatroPortas;

	//Override dos métodos
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.printf("� quatro portas? %b%n%n", quatroPortas);
	}


	//Métodos especificos do carro
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
