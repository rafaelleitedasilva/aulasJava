
public class Sabonete {
	String cheiro;
	String cor;

	
	public Sabonete(String cheiro, String cor, String nome) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public Sabonete(String linha) {
		String[] ArrayTeste1 = linha.split(",");
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		this.cheiro = ArrayTeste2[1].trim();
		
		String[] ArrayTeste3 = ArrayTeste2[1].split("=");
		this.cor = ArrayTeste3[1].trim();
	}

	@Override
	public String toString() {
		return "cheiro=" + cheiro + ", cor=" + cor;
	}

	
}
