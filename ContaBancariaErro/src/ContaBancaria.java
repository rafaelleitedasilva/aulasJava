
public class ContaBancaria {
	
	//Atributos privados da conta bancária que serão acessados
	//por métodos.

	private int numConta;
	private double saldo;
	private boolean ativo;
	private double limite = -400;
	
	public ContaBancaria(int numConta, double saldo) {
		this.numConta = numConta ;
		this.saldo = saldo;
		this.ativo = true;
	}
	
	//Personalizando o contrutor de ConanBancaria(), para que alguns valores já sejam setados na instância
	public ContaBancaria(boolean ativo, int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.ativo = ativo;
	}



	//M�todo de receber
	public void Receber(double valor){
		saldo += valor;
		
	}
	
	//M�todo de Ver
	public double Ver() {
		return saldo;
	}
	
	//M�todo de Dar
	public void Dar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else if (saldo - valor > -100) {
			System.out.println("Voce vai ficara negativo com essa operacao!");
			saldo -= valor;
			System.out.println("Seu novo saldo é -R$" + -1 * this.saldo);
		}else {
			System.out.println("Voce nao pode realizar essa operacao!");
		}
	}
	
	public void Sacar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else if (saldo - valor > limite) {
			System.out.println("Voce vai ficara negativo com essa operacao! Seu limite vai até -R$400,00");
			saldo -= valor;
			System.out.println("Seu novo saldo é -R$" + -1 * this.saldo);
			System.out.println("_______________");
		}else {
			System.out.println("Voce nao pode realizar essa operacao!");
		}
	}
	
}
