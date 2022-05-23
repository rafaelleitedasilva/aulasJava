public class Pessoa {

	String nome;
	int idade;
	Object endereco;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}

	
	
	
}