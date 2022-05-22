
public class Main {

	public static void main(String[] args) {
		
		//Pessoa que vai transferir
		
		Cliente Rafael = new Cliente();
		Rafael.Nome = "Rafael";
		Rafael.conta = "12345/0001-09";
		Rafael.saldo = 1218.09;
		
		pixTrans RafaelPix = new pixTrans();
		RafaelPix.chaveCPF = "123.123.127-08";
		RafaelPix.chaveAl = "ashdb12083bd2837r";
		RafaelPix.chaveEmail = "rafaklm.sjdhas@hotmail.com";
		RafaelPix.chaveTel = "+55(11)91235-8653";
		
		//Pessoa que vai receber
		
		Cliente Maria = new Cliente();
		Maria.Nome = "Maria";
		Maria.conta = "12345/0001-09";
		Maria.saldo = 1218.09;
		
		pixTrans MariaPix = new pixTrans();
		MariaPix.chaveCPF = "673.223.997-08";
		MariaPix.chaveAl = "ashdb12083bd2837r";
		MariaPix.chaveEmail = "rafaklm.sjdhas@hotmail.com";
		MariaPix.chaveTel = "+55(11)91235-8653";
		
		//Transferência entre diferentes contas
		pixTrans.Trans(400.00, MariaPix, Rafael, Maria);
		System.out.printf("O novo saldo na sua conta agora �: %.2f%n", Maria.saldo);
	
	}

}
