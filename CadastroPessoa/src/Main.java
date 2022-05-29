//Importando as bibliotecas que vou suar
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	//Classe principal("main") no qual vou rodar a minha aplicacao
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando o try do Scanner
		try(Scanner entrada = new Scanner(System.in)){
		//Criando uma Arraylist do tipo Pessoa 
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
			//Criando um for para colocar os valores de cada pessoa
		 	for (int x=0; x < 2; x++) {
		 		
				 //Instanciando a pessoa e instanciando o Endereco pelo setEndereco da classe Pessoa
		 		Pessoa pessoa = new Pessoa();
		 		pessoa.setEndereco(new Endereco());


				//Pegando o nome, idade, sexo e endereco das pessoas
		 		System.out.print("Digite seu nome: ");
		 		pessoa.setNome(entrada.nextLine());
		 		 
		 		System.out.print("Digite sua idade: ");
		 		pessoa.setIdade(entrada.nextInt());	 
		 		
		 		System.out.print("1 - Masculino | 2 - Feminino");
		 		pessoa.sexoNum(entrada.nextInt());
		 		
		 		System.out.print("Digite seu Bairro: ");
		 		pessoa.getEndereco().setBairro(entrada.next());
		 		 
		 		System.out.print("Digite o nome da sua rua: ");
		 		pessoa.getEndereco().setRua(entrada.next());
		 		
		 		System.out.print("Digite o numero da sua residencia: ");
		 		pessoa.getEndereco().setNum(entrada.nextInt());
		 		
				 //Adicionando o objeto pessoa na lista
		 		lista.add(pessoa);
		 	}
		 		
			//Fazendo um foreach para mostrar todos os objetos da lista
		 	for (Object valor : lista) {
		 		System.out.println(valor);
		 	}
		 	
		}
		
	}

}
