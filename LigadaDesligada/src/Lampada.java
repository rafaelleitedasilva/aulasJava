
public class Lampada {
	private boolean ligado;
	
	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void Ligar() {
		if(ligado == true) {
			System.out.println("A l�mpada j� est� ligada!");
		}else {
			ligado = true;
		}
		
	}
	
	public void Desligar() {
		if(ligado == false) {
			System.out.println("A l�mpada j� est� desligada!");
		}else {
			ligado = false;
		}
	}
	
	public void Imprimir() {
		if(ligado == true) {
			System.out.println("A l�mpada est� ligada.");
		}else {
			System.out.println("A l�mpada est� desligada.");
		}
	}
}
