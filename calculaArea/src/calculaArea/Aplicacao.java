package calculaArea;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CalculaArea A = new CalculaArea();
		
		System.out.println("Você quer calcular a área de qual figura ? ");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		int resposta = teclado.nextInt();
		
		if(resposta == 1) {
			int x = teclado.nextInt();
			System.out.println("Digite o lado x do quadrado: ");
			System.out.println("Resultado: ");
			A.calculaAe(x);
			
		}else if(resposta == 2) {
			System.out.println("Digite o lado x do retângulo: ");
			int x = teclado.nextInt();
			System.out.println("Digite o lado y do retângulo: ");
			int y = teclado.nextInt();
			System.out.println("Resultado: ");
			A.calculaAe(x, y);
			
		}else {
			System.out.println("Digite a base do triângulo: ");
			double x = teclado.nextInt();
			System.out.println("Digite a altura do triângulo: ");
			double y = teclado.nextInt();
			System.out.println("Resultado: ");
			A.calculaAe(x, y);
		}
		
		
		
		//System.out.printf("Digite os lados do quadrado: %n");
		//System.out.printf("x:");
		//int q1 = teclado.nextInt();
		//System.out.printf("y:");
		//int q2 = teclado.nextInt();
		//System.out.printf("A área do quadrado é: %d%n", q1*q2);
		
		//System.out.printf("Digite os lados do retângulo: %n");
		//System.out.printf("x:");
		//int r1 = teclado.nextInt();
		//System.out.printf("y:");
		//int r2 = teclado.nextInt();
		//System.out.printf("A área do retângulo é: %d %n", r1*r2);
		
		//System.out.printf("Digite os paramêtros do triângulo: %n");
		//System.out.printf("Base:");
		//int tb = teclado.nextInt();
		//System.out.printf("Altura:");
		//int th = teclado.nextInt();
		//System.out.printf("A área do triângulo é: %d", (tb*th)/2);
		
		
	}

}
