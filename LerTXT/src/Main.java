//IMPORTANDO TODAS AS BIBLIOTECAS QUE VOU UTILIZAR PARA ESCREVER/LER ARQUIVOS TXT
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	//CLASSE PRINCIPAL NO QUAL VOU RODAR A MINHA APLICACAO
	//O THROWS E RESPONSAVEL POR IGNORAR ALGUNS POSSIVEIS ERROS QUE PODEM APARECER QUANDO RODAMOS O BUFERRED
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int x = 1;
		//INSTANCIANDO A CLASSE SCANNER COM O PARAMETRO SYSTEM.IN
		Scanner entrada = new Scanner(System.in);
		//PRINT PERGUNTANDO QUAL TEXTO O USUARIO DESEJA GRAVAR
		//ESSE PROGRAMA FUNCIONA MELHOR QUANDO E APENAS UMA LINHA,
		//POR CAUSA DO SCANNER NAO SER TOTALMENTE FUNCIONAL.
		System.out.print("Digite o que deseja gravar:");
		String text = entrada.nextLine();
		
		//WHILE QUE VAI FICAR REPETINDO ESSA PEGUNTA ATE QUE O USUARIO NAO DESEJE MAIS GRAVAR NENHUM TEXTO
		while(x != 0) {
		System.out.println("Deseja gravar mais alguma coisa? 1-Sim 2-N�o");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.print("Digite o que deseja gravar:");
			//CONCATENANDO O TEXTO NA VARIAVEL
			text += entrada.next();
		}else{
			System.out.println("Saindo do pragrama!");
			x = 0;
		}
		}
		
		//FECHANDO O OBJETO DE ENTRADA DE DADOS DO SCANNER
		//TODA PORTA QUE ABRIMOS PARA INSERIR DADOS PRECISA SER FECHADA
		
		entrada.close();
		
		//O TRY E RESPONSAVEL POR FAZER O JAVA ESCREVER O TEXTO MESMO COM CHANCES DE DAR ERRO
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
			escrever.write(text);
		 	}
		//ASSIM COMO PRECISAMOS DO TRY NA HORA DE ESCREVER TAMBEM PRECISAMOS DELE PARA LEITURA DOS DADOS NDE UM TXT
		//O TRY E UMA MEDIDA OBRIGATORIA E FUNDAMENTAL PARA O FUNCIONAMENTO DO BUFFERED
		try (BufferedReader ler = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = "";
			
			while((line = ler.readLine()) != null) {
				string += line + "\n";
			}
			System.out.println(string);
		}
		
	}
}
