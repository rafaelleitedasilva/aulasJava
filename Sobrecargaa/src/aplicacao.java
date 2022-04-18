import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois números!");
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite o primeiro número: ");
		int x = teclado.nextInt();
		System.out.printf("Digite o segundo número:");
		int y = teclado.nextInt();
		
		//System.out.println("Digite o terceiro número:");
		//int z = teclado.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.printf("O resultado da conta é: %d ", soma);
		
		
	}

}
