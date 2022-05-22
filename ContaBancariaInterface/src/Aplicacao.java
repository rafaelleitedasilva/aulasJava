
public class Aplicacao {

	public static void main(String[] args) {
		//Na minha aplica��o eu deduzi que as contas investimento e corrente faziam parte de uma mesma conta banc�ria, ou seja
		//a pessoa que fosse dona de uma conta banc�ria teria que necessariamente ter uma conta investimento e uma conta corrente
		//por conta disso, a conta investimento inicia com saldo nulo, e a conta corrente inicia com o saldo igual ao da conta corrente.
		
		ContaBancaria ContaCorrente = new ContaCorrente();
		ContaBancaria ContaInvestimento = new ContaInvestimento();
		
		//Calculando o saldo das duas contas de acordo com as suas peculiaridades
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
			
		//Depositando valor nas duas contas
		ContaCorrente.depositar(200);
		ContaInvestimento.depositar(200);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		//Sacando valores das duas contas
		ContaCorrente.sacar(100);
		ContaInvestimento.sacar(100);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		//Transferindo valores de uma conta para outra
		ContaInvestimento.trasnferir(200, ContaCorrente);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		
		
	}

}
