import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		//Adicionando valores na lista, como ela � uma classe o modo de adicionar � por meio de um m�todo
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		
		
		//Agora ao inv�s de length utilizamos o m�todo size para saber o tamanho da lista
		for(int x=0; x<lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		
		System.out.println("________");
		
		//for enhanced � uma forma mais simplificada de passar pelos valores da array list
		for(Object valor : lista) {
			System.out.println(valor);
		}
	}

}
