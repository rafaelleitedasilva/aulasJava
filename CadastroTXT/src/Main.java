import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//INSTANCIANDO O SCANNER PARA PERMITIR A ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		//CRIANDO UMA LISTA GENÉRICA DE PESSOA PARA COLOCAR OS OBJETOS PESSOA
		List<Pessoa> Pessoas = new ArrayList<Pessoa>();
		//FOR PARA O CADASTRO DAS PESSOAS
		for (int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa(1);
			System.out.print("Digite seu nome:");
			pessoa.setNome(entrada.next());
			System.out.print("Digite sua idade:");
			pessoa.setIdade(entrada.next());
			System.out.print("Digite seu Gênero (1-Feminino 2-Masculino):");
			pessoa.sexoNum(entrada.nextInt());
			pessoa.setEndereco(new Endereco(1));
			System.out.print("Endereço:");
			System.out.print("Você mora em qual Rua:");
			pessoa.getEndereco().setRua(entrada.next());
			System.out.print("Digite o número da sua casa:");
			pessoa.getEndereco().setNum(entrada.next());
			System.out.print("Digite seu Bairro");
			pessoa.getEndereco().setBairro(entrada.next());
			//ADICIONANDO TODAS AS PESSOAS NA LISTA PESSOAS
			Pessoas.add(pessoa);
		}

		//INSTANCIANDO A CLASSE BUFFEREDWRITER PARA ESCREVER NO ARQUIVO TXT
		//O TRUE DEPOIS DO NOME DO ARQUIVO FAZ COM QUE OS TEXTOS SÃO SEJAM SOBRESCRITOS
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoa.txt", true))) {
			for (Pessoa pessoa : Pessoas) {
				escrever.write(pessoa.toString() + "\n");
			} 

			//CRIANDO UMA SEGUNDA LISTA PARA COLOCAR AS PESSOAS INSTANCIADAS A PARTIR DA STRING VINDA
			//VINDA DO ARQUIVO TXT
			List<Pessoa> Pessoas2 = new ArrayList<Pessoa>();
			try (BufferedReader reader = new BufferedReader(new FileReader("Pessoa.txt"))) {
				String line;
				//ENQUANTO A LINHA TIVER CONTEÚDO, OU SEJA, SER DIFERENTE DE NULO, PESSOAS SERÃO CRIADAS
				//A PARTIR DO CONSTRUTOR QUE RECEBE UMA STRING
				while ((line = reader.readLine()) != null) {
					Pessoa pessoa = new Pessoa(line);
					Pessoas2.add(pessoa);
				}
				
				//MOSTRANDO O CONTEÚDO DA SEGUNDA LISTA
				for (Pessoa cadastro : Pessoas2) {
				System.out.println(cadastro);
				}

			}
		}
	}
}