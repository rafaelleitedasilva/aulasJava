
public class Aplicacao {

	public static void main(String[] args) {
		//Na minha aplicação eu deduzi que as contas investimento e corrente faziam parte de uma mesma conta bancária, ou seja
		//a pessoa que fosse dona de uma conta bancária teria que necessariamente ter uma conta investimento e uma conta corrente
		//por conta disso, a conta investimento inicia com saldo nulo, e a conta corrente inicia com o saldo igual ao da conta corrente.
		
		ContaBancaria ContaCorrente = new ContaCorrente();
		ContaBancaria ContaInvestimento = new ContaInvestimento();
		
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
			
		ContaCorrente.depositar(200);
		ContaInvestimento.depositar(200);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		ContaCorrente.sacar(100);
		ContaInvestimento.sacar(100);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		ContaInvestimento.trasnferir(200, ContaCorrente);
		System.out.printf("O saldo na conta corrente é equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento é equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		
		
	}

}
