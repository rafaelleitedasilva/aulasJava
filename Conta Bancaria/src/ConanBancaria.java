
public class ConanBancaria {
	
	private int numConta;
	private double saldo;
	private boolean ativo;
	
	//Isso faz com que a inicializa��o tenha um valor predefinido
	public ConanBancaria() {
		numConta = 1 ;
		saldo = 1.0;
		ativo = true;
	}

	//M�todo de receber
	public void Receber(double valor){
		saldo += valor;
		
	}
	
	//M�todo de Ver
	public double Ver() {
		return saldo;
	}
	
	//M�todo de Dar
	public void Dar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else {
			System.out.println("Voc� n�o tem dinheiro suficiente na conta!");
		}
	}
	
}
