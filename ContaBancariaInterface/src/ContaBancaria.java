
public class ContaBancaria {
	protected double saldo = 1000;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor){
		saldo +=valor;
	}
	
	public void sacar(double valor){
		saldo -= valor;
	}
	
	public void trasnferir(double valor, ContaBancaria conta){
		saldo -= valor;
		conta.depositar(valor);
	}
	
	public double CalcularSaldo() {
		return 0;
	}
}
