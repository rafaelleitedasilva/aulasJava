package calculaArea;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite os lados do quadrado: %n");
		System.out.printf("x:");
		int q1 = teclado.nextInt();
		System.out.printf("y:");
		int q2 = teclado.nextInt();
		System.out.printf("A área do quadrado é: %d%n", q1*q2);
		
		System.out.printf("Digite os lados do retângulo: %n");
		System.out.printf("x:");
		int r1 = teclado.nextInt();
		System.out.printf("y:");
		int r2 = teclado.nextInt();
		System.out.printf("A área do retângulo é: %d %n", r1*r2);
		
		System.out.printf("Digite os paramêtros do triângulo: %n");
		System.out.printf("Base:");
		int tb = teclado.nextInt();
		System.out.printf("Altura:");
		int th = teclado.nextInt();
		System.out.printf("A área do triângulo é: %d", (tb*th)/2);
		
		
	}

}
