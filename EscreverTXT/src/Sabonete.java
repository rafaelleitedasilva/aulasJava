
public class Sabonete {
	String cheiro;
	String cor;
	String nome;
	
	public Sabonete(String cheiro, String cor, String nome) {
		this.cheiro = cheiro;
		this.cor = cor;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome do Sabonete: "+ nome +", Cheiro:" + cheiro + ", Cor:" + cor + "\n\n";
	}
	
	
}
