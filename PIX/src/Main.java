
public class Main {

	public static void main(String[] args) {
		
		
		Cliente Rafael = new Cliente();
		Rafael.Nome = "Rafael Leite da Silva";
		Rafael.conta = "12345/0001-09";
		Rafael.saldo = 1218.09;
		
		pixTrans RafaelPix = new pixTrans();
		RafaelPix.chaveCPF = "123.123.127-08";
		RafaelPix.chaveAl = "ashdb12083bd2837r";
		RafaelPix.chaveEmail = "rafaklm.sjdhas@hotmail.com";
		RafaelPix.chaveTel = "+55(11)91235-8653";
		
		System.out.println("O valor na sua conta é: " + Rafael.saldo);
		pixTrans.trans(120.00, RafaelPix.chaveCPF, Rafael.saldo);
		System.out.println("O valor na sua conta é: " + Rafael.saldo);
		
	}

}
