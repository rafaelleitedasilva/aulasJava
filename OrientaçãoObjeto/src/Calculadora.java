import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		double numero1 = 5;double numero2 = 2;
		double resultSum;double resultSub;double resultDiv;double resultMult;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero1 = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = teclado.nextInt();
				

		resultSum = numero1 + numero2;
		System.out.println("O resultado da soma é: " + resultSum);
	
		resultSub = numero1 - numero2;
		System.out.println("O resultado da subtração é: " + resultSub);
	
		resultDiv = numero1 / numero2;
		System.out.println("O resultado da divisão é: " + resultDiv);
		
		resultMult = numero1 * numero2;
		System.out.println("O resultado da multiplicação é: " + resultMult);

	}
}