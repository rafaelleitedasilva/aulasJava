
public class Bebida {
	//Classe genérica que servirá de "molde" para as outras classes
	private String nome;
	private boolean quente;
	
	//Construtor da Bebida que tem incluso nele o estado de quente e frio da bebida, além do nome da bebida
	public Bebida(String nome, boolean quente) {
		this.nome = nome;
		this.quente = quente;
	}
	
	//Método prepara que será único para cada bebida
	public void prepara() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isQuente() {
		return quente;
	}

	public void setQuente(boolean quente) {
		this.quente = quente;
	}
	
	
	
	
}
