public class pixTrans {
	//Atributos do Pix
	String chaveCPF;
	String chaveEmail;
	String chaveAl;
	String chaveTel;
	
	
	//Método de transferência que será utilizado para enviar dinheiro de uma pessoa para outra
	static void Trans(double valor, pixTrans chaves, Cliente clienteD, Cliente clienteR){
		 clienteD.saldo -= valor; 
		 clienteR.saldo += valor; 
		 System.out.printf("A trander�ncia para " + clienteR.Nome + " do CPF " + chaves.chaveCPF + " foi realizada! %n");
		 System.out.printf("O seu novo saldo �: %.2f%n",clienteD.saldo);
	}
}
