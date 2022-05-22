import java.util.Scanner;


public class CalculadoraTop {

	public static void main(String[] args) {
		//Aqui temos uma calculadora no qual podemos definir dois valores e realizar o cálculo entre eles de acordo com a escolha do usuário.
				Scanner entrada = new Scanner (System.in);
				int n1 =0;int n2 =0;
				String op = "";
				String escolha = "sim";
				int control = 0;
				

				while(escolha.equals("Sim") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("s") ) {
					System.out.println("CALCULADORA TOP");
					System.out.print("Selecione a opera��o desejada (+,-,/,*):");
					op = entrada.nextLine();
					
					//Definindo os valores
					System.out.print("Digite o primeiro valor:");
					n1 = Integer.parseInt(entrada.nextLine());
					
					System.out.print("Digite o segundo valor: ");
					n2 = Integer.parseInt(entrada.nextLine());
					
					//Fazendo a operação de acordo com a escolha do usuário, variando entre soma, subtração, divisão e multiplicação
					if(op.equals("+")) {
						System.out.println("O resultado da soma �: " + (n1+n2));
						control++;
					} else if(op.equals("-")) {
						System.out.println("O resutlado da subtra��o �: " + (n1-n2) + " ou " + (n2-n1));
						control++;
					} else if(op.equals("*")) {
						System.out.println("O resultado da multiplica��o �: " + (n1*n2));
						control++;
					} else if(op.equals("/")) {
						System.out.println("O resutlado da divis�o �: " + (n1/n2) + " ou " + (n2/n1));
						control++;
					}else {
						System.out.println("Opera��o invalida!");
					}
					
					//Se o usuário escolher sim retornamos para o início
					System.out.print("Voc� quer continuar realizando opera��es?");
					escolha = entrada.nextLine();
					System.out.println("________________________________________");
				}
					
				}
		}