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
		System.out.printf("A �rea do quadrado �: %d%n", q1*q2);
		
		System.out.printf("Digite os lados do ret�ngulo: %n");
		System.out.printf("x:");
		int r1 = teclado.nextInt();
		System.out.printf("y:");
		int r2 = teclado.nextInt();
		System.out.printf("A �rea do ret�ngulo �: %d %n", r1*r2);
		
		System.out.printf("Digite os param�tros do tri�ngulo: %n");
		System.out.printf("Base:");
		int tb = teclado.nextInt();
		System.out.printf("Altura:");
		int th = teclado.nextInt();
		System.out.printf("A �rea do tri�ngulo �: %d", (tb*th)/2);
		
		
	}

}
