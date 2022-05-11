
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria Conta = new ContaBancaria();
		ContaBancaria ContaCorrente = new ContaCorrente();
		ContaBancaria ContaInvestimento = new ContaInvestimento();
		
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
			
		Conta.depositar(200);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		Conta.sacar(1000);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		ContaInvestimento.trasnferir(200, ContaCorrente.saldo);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		
		
	}

}
