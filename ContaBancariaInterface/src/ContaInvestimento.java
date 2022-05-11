
public class ContaInvestimento extends ContaBancaria{
	
	ContaBancaria ContaBancaria = new ContaBancaria();
	private double saldo = ContaBancaria.getSaldo()/2;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo +=valor;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -=valor;
	}


	@Override
	public double CalcularSaldo() {
		// TODO Auto-generated method stub
		return saldo+(saldo*0.05);
	}

	
}
