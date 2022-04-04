import java.util.Scanner;
public class LojaTOP {

	public static void main(String[] args) {
		double prod1, prod2;
		int opcao1, opcao2;
		String nome1, nome2;
		Scanner teclado = new Scanner(System.in);
		
		//SELEÇÃO DOS PRODUTOS
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
		
		//VALOR DOS PRODUTOS
		System.out.print("Qual o valor do primeiro produto? ");
		 prod1 = teclado.nextFloat();
		System.out.print("Qual o valor do segundoo produto? ");
		 prod2 = teclado.nextFloat();
		 double Total = prod1 + prod2;
		 
		 //MOSTRA AS CATEGORIAS
		 if(opcao1==opcao2) {
			 System.out.println("Você escolheu o produto da categoria: " + nome1 ); 
		 } else {
			 System.out.println("Você escolheu os produtos das categorias: " + nome1 + " e " + nome2 + "\0");
		 }
		 
		 System.out.println("");
		 
		 //MOSTRA O VALOR A SER PAGO
		 if(opcao1==2 || opcao2==2) {
		System.out.println("O valor do seu desconto é de 15%, dessa forma \n o valor que era R$" + Total + " passa a ser R$" + Total*0.85);
		 } else {
			 System.out.println("Como você não escolheu uma peça de calça, não terá desconto!");
			 System.out.println("O valor que terá que pagar é R$" + Total);
			 
		 }
	}

}