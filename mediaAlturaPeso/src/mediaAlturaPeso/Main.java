package mediaAlturaPeso;

import java.util.Scanner;
//Digite a altura, peso e sexo de 10 pessoa e depois mostre qual tem o maior e menor valor de cada atr�buto!
public class Main {

	public static void main(String[] args) {
		int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Op��o sexo inv�lido!");
            }
            if (altura > maior) {
                 maior = altura;
            } else if (altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo � de " + maior + " m, e a menor � de " + menor + " m");
        System.out.println("A m�dia de altura dos homens � " + mediaHomens + " m");
        System.out.println("O n�mero de mulheres � " + qtMulheres);

        entrada.close();
		
	}

}
