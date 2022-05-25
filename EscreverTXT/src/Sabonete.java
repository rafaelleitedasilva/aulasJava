
public class Sabonete {
	String cheiro;
	String cor;

	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public Sabonete(String linha) {
		String[] ArrayTeste1 = linha.split(",");
		String[] ArrayTeste2 = ArrayTeste1[0].split("=");
		this.cheiro = ArrayTeste2[1].trim();
		
		String[] ArrayTeste3 = ArrayTeste1[1].split("=");
		this.cor = ArrayTeste3[1].trim();
	}

	@Override
	public String toString() {
		return "Sabonete: Cheiro= " + cheiro + ", Cor= " + cor ;
	}

	
}
