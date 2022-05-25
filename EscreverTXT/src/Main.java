import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		Sabonete sabonete = new Sabonete("Azedo", "Azul", "Jhonson");
		Sabonete sabonete2 = new Sabonete("Doce", "Marrom", "Mark");
		Sabonete sabonete3 = new Sabonete("Sem cheiro", "Branco", "Traus");
		
		List<String> lista = new ArrayList<String>();
			lista.add(sabonete.toString());
			lista.add(sabonete2.toString());
			lista.add(sabonete3.toString());
			
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			for (String valor : lista) {
				escrever.write(valor);
		 	}
			
		}
	 }
}
