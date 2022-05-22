import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual n�mero voc� quer multiplicar? ");
		//Pega o valor digitado
		int y= entrada.nextInt();
		
		//Realiza um for com o número digitado criando uma tabela de multiplicação até o 10
		for(int x=0; x<=10; x++) {
			//Printf para formatar a informação como uma tabuada
			System.out.printf("%d x %d = %d%n", y, x, y*x);
		}

	}

}
