import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		
		//Adicionando classes wraps para que o tipo Object possa ser tratado como inteiro.
		List<Integer> lista = new ArrayList<Integer>();
//		
		//Adicionando valores na lista, como ela é uma classe o modo de adicionar é por meio de um método
//		
//		lista.add("abc");
//		lista.add(12);
//		lista.add(true);
//		
//		
		//Agora ao invés de length utilizamos o método size para saber o tamanho da lista
//		
//		for(int x=0; x<lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
//		
//		System.out.println("________");
//		
		//for enhanced é uma forma mais simplificada de passar pelos valores da array list
//		
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
		//Como lista é uma classe quando removemos um elemento ela não fica nula ou mostra '0'
		//pq a remoção é dinâmica.
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
		//lista.set() seta um valor em uma posição específica
//		
//		lista.set(13, 1238);
//		
//		
//		
		//lista.add() adiciona um valo na lista e empurra os valores depois para posições posteriores
//		
//		lista.add(12, 236544);
//		
//		for(Object valor : lista) {
//			System.out.println(" Valor: " + valor);
//			
//		}
		
		Conta conta1 = new Conta("Água", 60);
		Conta conta2 = new Conta("Luz", 120);
		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta valor: listaDeContas) {
			System.out.println(valor);
		}
	}

}
