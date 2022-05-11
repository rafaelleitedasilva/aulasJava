
public class ContaBancaria {
	protected double saldo = 1000;

	public void depositar(double valor){
		saldo +=valor;
	}
	
	public void sacar(double valor){
		saldo -= valor;
	}
	
	public void trasnferir(double valor, double valor2){
		saldo -= valor;
		valor2 += valor;
	}
	
	public double CalcularSaldo() {
		return 0;
	}
}
