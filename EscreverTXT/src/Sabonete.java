
public class Sabonete {
	String cheiro;
	String cor;
	String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCheiro() {
		return cheiro;
	}
	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Nome do Sabonete: "+ nome +", Cheiro:" + cheiro + ", Cor:" + cor + "\n\n";
	}
	
	
}
