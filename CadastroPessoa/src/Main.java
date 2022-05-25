import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner entrada = new Scanner(System.in)){
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		 	for (int x=0; x < 2; x++) {
		 		
		 		Pessoa pessoa = new Pessoa();
		 		pessoa.setEndereco(new Endereco());

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
		 		
		 		lista.add(pessoa);
		 	}
		 		
		
		 	for (Object valor : lista) {
		 		System.out.println(valor);
		 	}
		 	
		}
		
	}

}
