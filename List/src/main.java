import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		
		//Adicionando classes wraps para que o tipo Object possa ser tratado como inteiro.
		List<Integer> lista = new ArrayList<Integer>();
//		
		//Adicionando valores na lista, como ela � uma classe o modo de adicionar � por meio de um m�todo
//		
//		lista.add("abc");
//		lista.add(12);
//		lista.add(true);
//		
//		
		//Agora ao inves de length utilizamos o m�todo size para saber o tamanho da lista
//		
//		for(int x=0; x<lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
//		
//		System.out.println("________");
//		
		//for enhanced � uma forma mais simplificada de passar pelos valores da array list
//		
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
		//Como lista � uma classe quando removemos um elemento ela nao fica nula ou mostra '0'
		//pq a remo��o � dinamica.
//		
//		lista.remove(1);
//		
		//Lista.clear() apaga todos os registros
//
//		lista.clear();
//		
//		for(int x=0; x<100; x++) {
//			lista.add(x, x);
//		}
//		
		//lista.set() seta um valor em uma posicao especifica
//		
//		lista.set(13, 1238);
//		
//		
//		
		//lista.add() adiciona um valo na lista e empurra os valores depois para posicoes posteriores
//		
//		lista.add(12, 236544);
//		
//		for(Object valor : lista) {
//			System.out.println(" Valor: " + valor);
//			
//		}
		

		Conta conta1 = new Conta("Agua", 60);
		Conta conta2 = new Conta("Luz", 120);
		
		//Criando uma lista de contas e adicioando conta1 e conta2
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		//ADICIONANDO OS OBJETOS NA LISTA, COMO A LISTA E DO TIPO CONTA NAO PRECISAMOS NOS PREOCUPAR SE A ARRAY VAI ACEITAR OU NAO OS NOSSOS DADOS
		//JA QUE SO VAMOS INSERIR DADOS DO TIPO CONTA
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		//Imprimindo os elementos dentro da listaDeContas
		for(Conta valor: listaDeContas) {
			System.out.println(valor);
		}
		
		 
	}

}
