import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	
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
