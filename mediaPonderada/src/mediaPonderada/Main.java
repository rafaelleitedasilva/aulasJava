package mediaPonderada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Media ponderada entre diferentes notas
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite a nota de matem�tica: ");
		double n1 = teclado.nextDouble();
		System.out.printf("Digite a nota de Geografia: ");
		double n2 = teclado.nextDouble();
		System.out.printf("Digite a nota de Filosofia: ");
		double n3 = teclado.nextDouble();
		System.out.printf("A m�dia ponderada �: %.2f", ((n1*2)+(n2*3)+(n3*5))/10);
	}

}
