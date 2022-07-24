import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos anos voc� t�m: ");
		int anos = entrada.nextInt();
		System.out.println("Digite quantos meses de vida voc� t�m: ");
		int meses = entrada.nextInt();
		System.out.println("Digite quantos dias de vida voc� t�m: ");
		int dias = entrada.nextInt();
		
		//Pega os valores das variaveis anos, meses e dias e realiza a conversão para o total de dias
		System.out.printf(" Voc� tem %d anos %d meses e %d dias, completando: %d dias", anos, meses, dias, (anos*365)+(meses*30)+dias);
	}

}
