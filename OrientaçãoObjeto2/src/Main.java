
public class Main {

	public static void main(String[] args) {
		
		Pessoa Rafael = new Pessoa();
		Pessoa Jorge = new Pessoa();
		
		//Editado o perfil Rafael
		Rafael.nome = "Rafael Leite da Silva";
		Rafael.numFigurinhas = 20;
		System.out.println("Número de figurinhas iniciais do Rafael: " + Rafael.numFigurinhas);
		
		//Editando o perfil Jorge
		Jorge.nome = "Rafael Leite da Silva";
		Jorge.numFigurinhas = 20;
		System.out.println("Número de figurinhas do Jorge depois da troca: " + Jorge.numFigurinhas +"\n");
		
		//Realizando a troca
		
		Rafael.Dar(3);
		Jorge.Receber(3);
		Jorge.Dar(5);
		Rafael.Receber(5);
		
		//Resultado final
		System.out.println("Número de figurinhas do Rafael depois da troca: " + Rafael.numFigurinhas);
		System.out.println("Número de figurinhas do Jorge depois da troca: " + Jorge.numFigurinhas);
	}

}
