
public class ConanBancaria {
	
	private int numConta;
	private double saldo;
	private boolean ativo;
	
	//Isso faz com que a inicialização tenha um valor predefinido
	public ConanBancaria() {
		numConta = 1 ;
		saldo = 1.0;
		ativo = true;
	}

	//Método de receber
	public void Receber(double valor){
		saldo += valor;
		
	}
	
	//Método de Ver
	public double Ver() {
		return saldo;
	}
	
	//Método de Dar
	public void Dar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else {
			System.out.println("Você não tem dinheiro suficiente na conta!");
		}
	}
	
}
