import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String solado = "Texto para ser solado!";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
			escrever.write(solado);
		}
		
		
	}

}
