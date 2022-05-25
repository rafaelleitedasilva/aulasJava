import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int x = 1;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o que deseja gravar:");
		String text = entrada.nextLine();
		
		while(x != 0) {
		System.out.println("Deseja gravar mais alguma coisa? 1-Sim 2-Não");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.print("Digite o que deseja gravar:");
			text += entrada.next();
		}else{
			System.out.println("Saindo do pragrama!");
			x = 0;
		}
		}
		
		entrada.close();
		
		//O try é responsável por fazer o Java tentar rodar o código mesmo tendo a possibilidade de dar erro
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
			escrever.write(text);
		 	}
	
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
