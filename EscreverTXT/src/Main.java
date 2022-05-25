import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		String solado = "Texto para \n  ser solado! ";
		
		Sabonete sabonete = new Sabonete();
		List<String> lista = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		
		
		for(int x = 0; x < 3; x++) {
			System.out.println("Digite o nome do Sabonete: ");
			sabonete.setNome(entrada.next());
			
			System.out.println("Digite o cheiro: ");
			sabonete.setCheiro(entrada.next());
			
			System.out.println("Digite a cor: ");
			sabonete.setCor(entrada.next());
			
			lista.add(sabonete.toString());
		}
		
		
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			
			for (String valor : lista) {
				escrever.write(valor);
		 	}
		}
			
	}

}
