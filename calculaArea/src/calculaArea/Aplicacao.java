package calculaArea;

//fazendo a importação da biblioteca 
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Criando o objeto teclado que vai permitir o input de valores
		Scanner teclado = new Scanner(System.in);
		//Instanciando a classe CalculaArea
		CalculaArea A = new CalculaArea();
		
		//Pergunta qual figura quer calcular área
		System.out.println("Voc� quer calcular a �rea de qual figura ? ");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Ret�ngulo");
		System.out.println("3 - Tri�ngulo");
		int resposta = teclado.nextInt();
		
		//Pega o valor da variável resposta e dependendo do valor retorna o calculo da área
		if(resposta == 1) {
			System.out.println("Digite o lado x do quadrado: ");
			//Pegando o valor do lado do quadrado
			int x = teclado.nextInt();
			System.out.println("Resultado: ");
			//Realizando o calculo da area e mostrando
			A.calculaAe(x);
			
		}else if(resposta == 2) {
			//Nesse caso como estamos trantando de uma figura com dois lados diferente precisamos de duas variáveis
			System.out.println("Digite o lado x do ret�ngulo: ");
			int x = teclado.nextInt();
			System.out.println("Digite o lado y do ret�ngulo: ");
			int y = teclado.nextInt();
			System.out.println("Resultado: ");
			//Realizando o calculo e mostrando o resultado
			A.calculaAe(x, y);
			
		}else {
			//Caso a resposta não seja nem 1, nem 2, o programa realiza o calculo do triângulo
			//Caso fosse pedido poderíamos usar o else como uma medida de prevenção, para garantir 
			//1ue o usuário sempre selecionasse uma das tês figuras!
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
