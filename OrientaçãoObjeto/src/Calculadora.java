import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		double numero1 = 5;double numero2 = 2;
		double resultSum;double resultSub;double resultDiv;double resultMult;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = teclado.nextInt();
				

		resultSum = numero1 + numero2;
		System.out.println("O resultado da soma �: " + resultSum);
	
		resultSub = numero1 - numero2;
		System.out.println("O resultado da subtra��o �: " + resultSub);
	
		resultDiv = numero1 / numero2;
		System.out.println("O resultado da divis�o �: " + resultDiv);
		
		resultMult = numero1 * numero2;
		System.out.println("O resultado da multiplica��o �: " + resultMult);

	}
}