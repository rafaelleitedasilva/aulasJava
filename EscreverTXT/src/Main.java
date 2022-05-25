import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Sabonete sabonete = new Sabonete("Azedo", "Azul");
		Sabonete sabonete2 = new Sabonete("Doce", "Marrom");
		Sabonete sabonete3 = new Sabonete("Sem cheiro", "Branco");
		
		List<String> lista = new ArrayList<String>();
		List<String> lista2 = new ArrayList<String>();
			lista.add(sabonete.toString());
			lista.add(sabonete2.toString());
			lista.add(sabonete3.toString());
			
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			for (String valor : lista) {
				escrever.write(valor);
		 }
		try (BufferedReader ler = new BufferedReader(new FileReader("saida.txt"))) {
				String line;
				while((line = ler.readLine()) != null) {
					Sabonete saboneteString = new Sabonete(line);
					lista2.add(saboneteString.toString());
				}
		}
	
	  }
		System.out.println(lista2);
    }
  }
