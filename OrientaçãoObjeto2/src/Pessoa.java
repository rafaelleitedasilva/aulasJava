
public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void Receber(int numFigurinhas) {
		this.numFigurinhas = this.numFigurinhas + numFigurinhas;
		
	}
	
	void Dar(int numFigurinhas) {
		this.numFigurinhas = this.numFigurinhas - numFigurinhas;
	}
}
