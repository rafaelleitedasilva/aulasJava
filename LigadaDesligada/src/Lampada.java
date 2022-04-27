
public class Lampada {
	private boolean ligado;
	
	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void Ligar() {
		if(ligado == true) {
			System.out.println("A lâmpada já está ligada!");
		}else {
			ligado = true;
		}
		
	}
	
	public void Desligar() {
		if(ligado == false) {
			System.out.println("A lâmpada já está desligada!");
		}else {
			ligado = false;
		}
	}
	
	public void Imprimir() {
		if(ligado == true) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");
		}
	}
}
