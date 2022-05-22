
public abstract class ContaBancaria {
	//A conta bancaria já começa com 1000, mas seria possível colocar o construtor para que  
	protected static double saldo = 1000;

	public static double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		ContaBancaria.saldo = saldo;
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
	
	public abstract double CalcularSaldo();
}
