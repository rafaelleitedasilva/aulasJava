
public class ConanBancaria {
	
	private int numConta;
	private double saldo;
	private boolean ativo;
	
	
	public void Receber(double valor){
		saldo += valor;
		
	}
	public double Ver() {
		return saldo;
	}
	
	public void Dar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else {
			System.out.println("Você não tem dinheiro suficiente na conta!");
		}
	}
}
