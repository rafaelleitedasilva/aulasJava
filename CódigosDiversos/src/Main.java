import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual número você quer multiplicar? ");
		int y= entrada.nextInt();
		
		for(int x=0; x<=10; x++) {
			System.out.printf("%d x %d = %d%n", y, x, y*x);
		}

	}

}
