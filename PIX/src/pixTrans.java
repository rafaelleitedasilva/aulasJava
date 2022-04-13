public class pixTrans {
	String chaveCPF;
	String chaveEmail;
	String chaveAl;
	String chaveTel;
	
	
	
	static void Trans(double valor, pixTrans chaves, Cliente clienteD, Cliente clienteR){
		 clienteD.saldo -= valor; 
		 clienteR.saldo += valor; 
		 System.out.printf("A tranderência para " + clienteR.Nome + " do CPF " + chaves.chaveCPF + " foi realizada! %n");
		 System.out.printf("O seu novo saldo é: %.2f%n",clienteD.saldo);
	}
}
