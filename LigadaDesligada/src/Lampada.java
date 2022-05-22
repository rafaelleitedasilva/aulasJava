
public class Lampada {
	//Atributo booleaano true or false
	private boolean ligado;
	
	//método para mudar o estado da lampada
	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	
	//Ligando a lampada caso ela já esteja desligada
	public void Ligar() {
		if(ligado == true) {
			System.out.println("A l�mpada j� est� ligada!");
		}else {
			ligado = true;
		}
		
	}
	
	//Desligando caso ela esteja ligada
	public void Desligar() {
		if(ligado == false) {
			System.out.println("A l�mpada j� est� desligada!");
		}else {
			ligado = false;
		}
	}
	
	//Imprimindo o seu estado
	public void Imprimir() {
		if(ligado == true) {
			System.out.println("A l�mpada est� ligada.");
		}else {
			System.out.println("A l�mpada est� desligada.");
		}
	}
}
