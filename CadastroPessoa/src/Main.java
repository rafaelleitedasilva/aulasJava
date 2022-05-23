import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		List lista = new ArrayList();
		
		
		
		 	for (int x=0; x < 4; x++) {
		 		
		 			Conta usuario = new Conta();
		 			Endereco endereco = new Endereco();	

		 		System.out.println("Digite seu nome: ");
		 		 usuario.nome = entrada.next(); 
		 		 
		 		System.out.println("Digite sua idade: ");
		 		 usuario.idade = entrada.nextInt();	 
		 		 
		 		System.out.println("Digite seu Bairro: ");
		 		endereco.bairro = entrada.next();
		 		 
		 		System.out.println("Digite o nome da sua rua: ");
		 		endereco.rua = entrada.next(); 
		 		
		 		System.out.println("Digite o numero da sua residencia: ");
		 		endereco.num = entrada.nextInt();
		 		
		 		usuario.endereco = endereco;
		 			lista.add(usuario);
		 		
		 	}
		 		
		
		 	for (Object valor : lista) {
		 		System.out.println(valor);
		 	}
		
	}

}
