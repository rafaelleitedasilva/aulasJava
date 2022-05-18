import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		//Adicionando valores na lista, como ela é uma classe o modo de adicionar é por meio de um método
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		
		
		//Agora ao invés de length utilizamos o método size para saber o tamanho da lista
		for(int x=0; x<lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		
		System.out.println("________");
		
		//for enhanced é uma forma mais simplificada de passar pelos valores da array list
		for(Object valor : lista) {
			System.out.println(valor);
		}
	}

}
