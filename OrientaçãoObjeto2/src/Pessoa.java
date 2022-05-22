
public class Pessoa {
	//Classe que será utilizada como molde para criar os objetos no Main
	String nome;
	int numFigurinhas;
	
	//Métodos de Receber e Dar figurinhas
	void Receber(int numFigurinhas) {
		this.numFigurinhas = this.numFigurinhas + numFigurinhas;
		
	}
	
	void Dar(int numFigurinhas) {
		this.numFigurinhas = this.numFigurinhas - numFigurinhas;
	}
}
