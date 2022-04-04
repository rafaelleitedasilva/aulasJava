import java.util.Scanner;
public class Vendas {

	public static void main(String[] args) {
		double prod1, prod2;
		int opcao1, opcao2;
		String nome1, nome2;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Bem-vindo a nossa loja!");
		System.out.println("");
		System.out.println("Veja as nossas opções de produtos: ");
		System.out.println(" 1-Camiseta \n 2-Calça \n 3-Relógio \n 4-Chapéu");
		System.out.print("Escolha o seu primeiro produto: ");
		opcao1 = teclado.nextInt();
		System.out.print("Escolha o seu segundo produto: ");
		opcao2 = teclado.nextInt();
		
		if(opcao1 == 1){
			 nome1 = "Camiseta";
		} else if (opcao1 == 2) {
			 nome1 = "Calça";
		} else if (opcao1 == 3) {
			 nome1 = "Relógio";
		} else {
			 nome1 = "Chapéu";
		}
		
	
		
		if(opcao2 == 1){
			 nome2 = "Camiseta";
		} else if (opcao2 == 2) {
			 nome2 = "Calça";
		} else if (opcao2 == 3) {
			 nome2 = "Relógio";
		} else {
			 nome2 = "Chapéu";
		}
		
		
		if(opcao1 == opcao2) {
			nome2="";
		}
		
		System.out.println("Qual o valor do primeiro produto? ");
		 prod1 = teclado.nextFloat();
		System.out.println("Qual o valor do segundoo produto? ");
		 prod2 = teclado.nextFloat();
		 double Total = prod1 + prod2;
		 System.out.println("Você escolheu os produtos da(s) categoria(s): " + nome1 + " " + nome2 + "\0");
		System.out.println("O valor do seu desconto é de 15%, dessa forma \n o valor que era " + Total + " passa a ser " + Total*0.85);
	}

}
