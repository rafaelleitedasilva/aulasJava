import java.util.Locale;

public class Conta {
	double valor;
	String nome;
	
	Locale.
	
	public Conta( String nome, double valor) {
		this.valor = valor;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Conta de " + nome + " R$" + valor;
	}
	
	
	
}
