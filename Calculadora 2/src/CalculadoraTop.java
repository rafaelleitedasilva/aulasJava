import java.util.Scanner;


public class CalculadoraTop {

	public static void main(String[] args) {
				Scanner entrada = new Scanner (System.in);
				int n1 =0;int n2 =0;
				String op = "";
				String escolha = "sim";
				int control = 0;
				
				while(escolha.equals("Sim") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("s") ) {
					System.out.println("CALCULADORA TOP");
					System.out.print("Selecione a opera��o desejada (+,-,/,*):");
					op = entrada.nextLine();
					
					
					System.out.print("Digite o primeiro valor:");
					n1 = Integer.parseInt(entrada.nextLine());
					
					System.out.print("Digite o segundo valor: ");
					n2 = Integer.parseInt(entrada.nextLine());
					
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
					
					System.out.print("Voc� quer continuar realizando opera��es?");
					escolha = entrada.nextLine();
					System.out.println("________________________________________");
				}
					
				}
		}