import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//FUNDAMENTOS JAVA E UMA PASTA COM DIVERSOS CONCEITOS DE JAVA, ALGUNHS SIMPLES, OUTROS MAIS COMPLEXOS
//		int x = 100;
//		double y = 200.3;
		
		//DECLARANDO VARIAVEIS
//		int a = 0;
//		double b = 0;
//
		//REALIZANDO O CASTING IMPLICITO DO NUMERO 100000 PARA O TIPO SHORT
		//O CASTING IMPLICITO E OBRIGATORIO NESSES CASOS JA QUE OCORRE UMA PERDA
		//DE INFORMACAO AO TRANSFORMAR OS TIPOS
		
//		short z = (short) 100000;
//
//		a = (int) y;
//		b = x;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println('x' + 'y');
//		System.out.println(z+"\n");
//
//		int idadePessoa = 60;
		
		//IF-ELSE BASICO DO JAVA
//		if (idadePessoa < 18) {
//			System.out.println("Voc� n�o pode beber!");
//		} else if (idadePessoa >= 60) {
//			System.out.println("Voc� � muito velho! Pare de beber!");
//		} else {
//			System.out.println("Voc� pode beber!");
//		}

		//CONCATENANDO UMA STRING
//		System.out.println("Voc� tem " + idadePessoa + " anos \n");
//
//		int dia = 10;
		//O SWITCH E uma forma alternativa de realizar um teste condicional e retornar um valor caso o teste seja true
//		switch (dia) {
//		case 1:
//			System.out.println("Hoje � domingo");
//			break;
//		case 2:
//			System.out.println("Hoje � segunda-feira");
//			break;
//		case 3:
//			System.out.println("Hoje � ter�a-feira");
//			break;
//		case 4:
//			System.out.println("Hoje � quarta-feira");
//			break;
//		case 5:
//			System.out.println("Hoje � quinta-feira");
//			break;
//		case 6:
//			System.out.println("Hoje � sexta-feira");
//			break;
//		case 7:
//			System.out.println("Hoje � s�bado");
//			break;
//		default:
//			System.out.println("Esse dia n�o existe! T� maluco p�");
//		}
//		
//		char caractere = '2';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("Primeira letra do alfabeto");
//			break;
//		case 'b':
//			System.out.println("Bobo");
//			break;
//		default:
//			System.out.println("Some daqui meu");
//		}
//		
//		String farol = "Laranja";
//		
//		switch(farol) {
//		case "Verde":
//			System.out.println("Prossiga");
//			break;
//		case "Amarelo":
//			System.out.println("Aten��o!");
//			break;
//		case "Vermelho":
//			System.out.println("Pare!");
//			break;
//		default:
//			System.out.println("Que cor � essa ai? Conhe�o n�o");
//		}
//
//		int x = 0;
//
//		while (x < 10) {
//			x = x + 1;
//			System.out.println(x);
//		}
//
//		int x = 0;
//
//		do {
//			x = x + 1;
//			System.out.println(x);
//		} while (x < 10);
		
		//USANDO O SCANNER PELA PRIMEIRA VEZ
//	
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite o n�mero que voc� deseja saber a tabuada");
//		int x = entrada.nextInt();
//		
//		for(int y=1; y<=10; y++) {
//			System.out.println(x + " x "+ y + " = "+ x*y);
//		}
//		
		
		//CRIANDO UM ARRAY DO TIPO DOUBLE
//		double x[] = {
//			3,5,3,5
//		};
//		
//		for(int aux = 0; aux<x.length;aux++) {
//			System.out.println("Valor do �ndice: " + aux + " = " + x[aux]);
//		}
//		
//		
//		System.out.println("");
//		System.out.println("-------------------------------");
//		System.out.println("");
//		
//		String nome[] = {
//				"Joselito","Marcia","Rafael","Silvia","Carlos","Eva"
//			};
//		 
//		for(int aux1 = 0; aux1<nome.length;aux1++) {
//			System.out.println("Valor do �ndice: " + aux1 + " = " + nome[aux1]);
//			
//		}
//		
//		int[] arrayInt = new int[5];
//		String[] arrayString = new String[2];
//		double[] arrayDouble = new double[4];
//		
//		arrayInt[3] = 4;
//		int[] numero = new int[6];
//		
//		Scanner teclado = new Scanner(System.in);
//		
//		for(int aux2 = 0; aux2<numero.length;aux2++) {
//			System.out.printf("Digite um n�mero qualquer:");
//			numero[aux2] = teclado.nextInt();
//		}
//		
		//FOR USANDO COMO LIMITE O TAMANHO DA ARRAY
//		System.out.println("");
//		for(int aux2 = 0; aux2<numero.length;aux2++) {
//			System.out.println("Valor do �ndice: " + aux2 + " = " + numero[aux2]);
//
//		}

		
		
		//Como o arrayObject E do tipo Object ele herda da classe pai
		//isso significa que arrayObject aceitar qualquer tipo de valor

//		obj[2] = 12;
//
//		
//		Object[] arrayObject = new Object[5];
//		arrayObject[0] = 18;
//		arrayObject[1] = "Rafael";
//		arrayObject[2] = 1.89;
//		arrayObject[3] = true;
//		arrayObject[4] = obj[2];
//		
//		for(int aux2 = 0; aux2<arrayObject.length;aux2++) {
//			System.out.println("Valor do �ndice: " + aux2 + " = " + arrayObject[aux2]);
//
//		}
		
		//O array Bidirecional permite criar linhas e colunas!
		int[][] arrayBidirecional = new int[3][5];
		arrayBidirecional[0][3] = 7;
		arrayBidirecional[2][1] = 2;
		
		//Usamos dois for um para linha e outro para coluna
		for(int linha = 0; linha<arrayBidirecional.length;linha++) {
			//arrayBidirecional[0] faz com que a gente pegue o valor da coluna
			for(int coluna = 0; coluna<arrayBidirecional[0].length;coluna++) {
				System.out.printf("Matriz%dx%d = %d %n",linha,coluna, arrayBidirecional[linha][coluna]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

