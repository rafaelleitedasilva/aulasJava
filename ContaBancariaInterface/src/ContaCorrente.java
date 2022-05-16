
public class ContaCorrente extends ContaBancaria{
	
	//O saldo da conta corrente é igual ao da conta bancária
	private double saldo = ContaBancaria.getSaldo();

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	//Fazendo o override dos métodos do conta bancária
	//já que estou tratando as extends como contas separadas.
	
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
		return saldo-(saldo*0.10);
	}
	
}
