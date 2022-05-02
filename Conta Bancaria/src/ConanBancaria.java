
public class ConanBancaria {
	
	private int numConta;
	private double saldo;
	private boolean ativo;
	
	public ConanBancaria() {
		numConta = 1 ;
		saldo = 1.0;
		ativo = true;
	}
	
	public ConanBancaria(boolean ativo, int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.ativo = ativo;
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
