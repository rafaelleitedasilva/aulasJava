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
					System.out.print("Selecione a operação desejada (+,-,/,*):");
					op = entrada.nextLine();
					
					
					System.out.print("Digite o primeiro valor:");
					n1 = Integer.parseInt(entrada.nextLine());
					
					System.out.print("Digite o segundo valor: ");
					n2 = Integer.parseInt(entrada.nextLine());
					
					if(op.equals("+")) {
						System.out.println("O resultado da soma é: " + (n1+n2));
						control++;
					} else if(op.equals("-")) {
						System.out.println("O resutlado da subtração é: " + (n1-n2) + " ou " + (n2-n1));
						control++;
					} else if(op.equals("*")) {
						System.out.println("O resultado da multiplicação é: " + (n1*n2));
						control++;
					} else if(op.equals("/")) {
						System.out.println("O resutlado da divisão é: " + (n1/n2) + " ou " + (n2/n1));
						control++;
					}else {
						System.out.println("Operação invalida!");
					}
					
					System.out.print("Você quer continuar realizando operações?");
					escolha = entrada.nextLine();
					System.out.println("________________________________________");
				}
					
				}
		}