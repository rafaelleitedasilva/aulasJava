import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		//A sobrecarga é a técnica de utilziar o mesmo nome em um método, mas que possui funções diferentes.
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois n�meros!");
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite o primeiro n�mero: ");
		int x = teclado.nextInt();
		System.out.printf("Digite o segundo n�mero:");
		int y = teclado.nextInt();
		
		//System.out.println("Digite o terceiro n�mero:");
		//int z = teclado.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.printf("O resultado da conta �: %d ", soma);
		
		
	}

}
