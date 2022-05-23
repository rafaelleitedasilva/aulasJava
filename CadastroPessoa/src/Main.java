import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		
		
		 	for (int x=0; x < 2; x++) {
		 		
		 			Pessoa pessoa = new Pessoa();
		 			Endereco endereco = new Endereco();	

		 		System.out.println("Digite seu nome: ");
		 		pessoa.nome = entrada.next(); 
		 		 
		 		System.out.println("Digite sua idade: ");
		 		pessoa.idade = entrada.nextInt();	 
		 		 
		 		System.out.println("Digite seu Bairro: ");
		 		endereco.bairro = entrada.next();
		 		 
		 		System.out.println("Digite o nome da sua rua: ");
		 		endereco.rua = entrada.next(); 
		 		
		 		System.out.println("Digite o numero da sua residencia: ");
		 		endereco.num = entrada.nextInt();
		 		
		 		pessoa.endereco = endereco;
		 			lista.add(pessoa);
		 		
		 	}
		 		
		
		 	for (Object valor : lista) {
		 		System.out.println(valor);
		 	}
		
	}

}
