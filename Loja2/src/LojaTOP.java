import java.util.Scanner;
public class LojaTOP {

	public static void main(String[] args) {
		double prod1, prod2;
		int opcao1, opcao2;
		String nome1, nome2;
		Scanner teclado = new Scanner(System.in);
		
		//SELE��O DOS PRODUTOS
		System.out.println("Bem-vindo a nossa loja!");
		System.out.println("");
		System.out.println("Veja as nossas op��es de produtos: ");
		System.out.println(" 1-Camiseta \n 2-Cal�a \n 3-Rel�gio \n 4-Chap�u");
		System.out.print("Escolha o seu primeiro produto: ");
		opcao1 = teclado.nextInt();
		System.out.print("Escolha o seu segundo produto: ");
		opcao2 = teclado.nextInt();
		
		//SELECIONANDO O PRODUTO
		if(opcao1 == 1){
			 nome1 = "Camiseta";
		} else if (opcao1 == 2) {
			 nome1 = "Cal�a";
		} else if (opcao1 == 3) {
			 nome1 = "Rel�gio";
		} else {
			 nome1 = "Chap�u";
		}
		
	
		//SELECIONANDO O SEGUNDO PRODUTO
		if(opcao2 == 1){
			 nome2 = "Camiseta";
		} else if (opcao2 == 2) {
			 nome2 = "Cal�a";
		} else if (opcao2 == 3) {
			 nome2 = "Rel�gio";
		} else {
			 nome2 = "Chap�u";
		}
		
		//VALOR DOS PRODUTOS
		System.out.print("Qual o valor do primeiro produto? ");
		 prod1 = teclado.nextFloat();
		System.out.print("Qual o valor do segundoo produto? ");
		 prod2 = teclado.nextFloat();
		 double Total = prod1 + prod2;
		 
		 //MOSTRA AS CATEGORIAS
		 if(opcao1==opcao2) {
			 System.out.println("Voc� escolheu o produto da categoria: " + nome1 ); 
		 } else {
			 System.out.println("Voc� escolheu os produtos das categorias: " + nome1 + " e " + nome2 + "\0");
		 }
		 
		 System.out.println("");
		 
		 //MOSTRA O VALOR A SER PAGO
		 if(opcao1==2 || opcao2==2) {
		System.out.println("O valor do seu desconto � de 15%, dessa forma \n o valor que era R$" + Total + " passa a ser R$" + Total*0.85);
		 } else {
			 System.out.println("Como voc� n�o escolheu uma pe�a de cal�a, n�o ter� desconto!");
			 System.out.println("O valor que ter� que pagar � R$" + Total);
			 
		 }
	}

}