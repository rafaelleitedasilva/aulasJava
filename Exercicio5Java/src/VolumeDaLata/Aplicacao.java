package VolumeDaLata;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de Volume Cilíndrico!");
		System.out.println("Digite o Raio do Cilindro: ");
		double raio = teclado.nextDouble();
		System.out.println("Digite a Altura do Cilindro: ");
		double altura = teclado.nextDouble();
		System.out.println("O volume do cilindro é igual a: " + Math.PI*Math.pow(raio, 2)*altura);
	}

}
