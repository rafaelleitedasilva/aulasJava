
public class ContaCorrente extends ContaBancaria{
	
	//O saldo da conta corrente � igual ao da conta banc�ria
	private double saldo = ContaBancaria.getSaldo();

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	//Fazendo o override dos m�todos do conta banc�ria
	//j� que estou tratando as extends como contas separadas.
	
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
