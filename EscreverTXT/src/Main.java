//IMPORTANDO TODOS AS BIBLIOTECAS QUE VAMOS UTILIZAR NESSE PROGRAMA
//UMA FORMA MAIS RAPIDA DE IMPORTAR TODAS AS BIBLIOTECAS E USANDO AS TECLAS:
//CTRL + SHIFT + O
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		//INSTANCIANDO A CLASSE SABONETE EM DIFERENTES VARIAVEIS COM DIFERENTES VALORES
		Sabonete sabonete = new Sabonete("Azedo", "Azul");
		Sabonete sabonete2 = new Sabonete("Doce", "Marrom");
		Sabonete sabonete3 = new Sabonete("Sem cheiro", "Branco");
		
		//CRIANDO LISTAS 
		List<String> lista = new ArrayList<String>();
		List<String> lista2 = new ArrayList<String>();

		//ARMAZENANDO OS SABONETES NA LISTA
			lista.add(sabonete.toString());
			lista.add(sabonete2.toString());
			lista.add(sabonete3.toString());
			
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			//ESCREVENDO OS VALORES DENTRO DA LISTA COM UM FOREACH
			for (String valor : lista) {
				//CADA OBJETO SABONETE VAI ESTAR EM UMA LINHA DIFERENTE NO ARQUIVO TXT
				escrever.write(valor);
		 }
		 //LENDO OS OBJETOS QUE ESCREVEMOS NO ARQUIVO
		try (BufferedReader ler = new BufferedReader(new FileReader("saida.txt"))) {
				String line;
				//FAZENDO UM WHILE QUE VAI DURAR ATE QUE O .READLINE() BATA EM UM VALOR NULO
				while((line = ler.readLine()) != null) {
					//INSTANCIANDO AS STRINGS PRESENTES EM CADA LINHA DO ARQUIVO TXT
					Sabonete saboneteString = new Sabonete(line);
					//ADICIONANDO ESSES VALORES NA SEGUNDA LISTA
					lista2.add(saboneteString.toString());
				}
		}
	
	  }
	  //PRINTANDO OS VALORES DA SEGUNDA LISTA PARA TER CERTEZA DO RESULTADO
		System.out.println(lista2);
    }
  }
