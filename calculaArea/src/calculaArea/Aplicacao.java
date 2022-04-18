package calculaArea;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CalculaArea A = new CalculaArea();
		
		System.out.println("Voc� quer calcular a �rea de qual figura ? ");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Ret�ngulo");
		System.out.println("3 - Tri�ngulo");
		int resposta = teclado.nextInt();
		
		if(resposta == 1) {
			int x = teclado.nextInt();
			System.out.println("Digite o lado x do quadrado: ");
			System.out.println("Resultado: ");
			A.calculaAe(x);
			
		}else if(resposta == 2) {
			System.out.println("Digite o lado x do ret�ngulo: ");
			int x = teclado.nextInt();
			System.out.println("Digite o lado y do ret�ngulo: ");
			int y = teclado.nextInt();
			System.out.println("Resultado: ");
			A.calculaAe(x, y);
			
		}else {
			System.out.println("Digite a base do tri�ngulo: ");
			double x = teclado.nextInt();
			System.out.println("Digite a altura do tri�ngulo: ");
			double y = teclado.nextInt();
			System.out.println("Resultado: ");
			A.calculaAe(x, y);
		}
		
		
		
		//System.out.printf("Digite os lados do quadrado: %n");
		//System.out.printf("x:");
		//int q1 = teclado.nextInt();
		//System.out.printf("y:");
		//int q2 = teclado.nextInt();
		//System.out.printf("A �rea do quadrado �: %d%n", q1*q2);
		
		//System.out.printf("Digite os lados do ret�ngulo: %n");
		//System.out.printf("x:");
		//int r1 = teclado.nextInt();
		//System.out.printf("y:");
		//int r2 = teclado.nextInt();
		//System.out.printf("A �rea do ret�ngulo �: %d %n", r1*r2);
		
		//System.out.printf("Digite os param�tros do tri�ngulo: %n");
		//System.out.printf("Base:");
		//int tb = teclado.nextInt();
		//System.out.printf("Altura:");
		//int th = teclado.nextInt();
		//System.out.printf("A �rea do tri�ngulo �: %d", (tb*th)/2);
		
		
	}

}
