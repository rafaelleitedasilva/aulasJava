
public class Veiculo {
	//Classe que vai ser herdada por todas as outras e "compartilha" os métodos por meio do override.
	//O override nada mais é do que o sobrescrever de um método.
	private boolean ligado;

	public boolean isLigado() {
		return ligado;
	}

	public void Desligar() {
		this.ligado = false;
	}
	
	public void Ligar() {
		this.ligado = true;
	}
	
	
}
