
public class ContaInvestimento extends ContaBancaria{
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		super.sacar(valor);
	}

	@Override
	public void trasnferir(double valor, double valor2) {
		// TODO Auto-generated method stub
		super.trasnferir(valor, valor2);
	}

	@Override
	public double CalcularSaldo() {
		// TODO Auto-generated method stub
		return saldo+(saldo*0.05);
	}

	
}
