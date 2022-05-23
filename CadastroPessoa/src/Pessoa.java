
public class Pessoa {

	private String nome;
	private int idade;
	private Endereco endereco;
	Sexo sexo;
	
	public void sexoNum(int num) {
		if(num == 1) {
			sexo = sexo.MASCULINO;
		}else {
			sexo = sexo.FEMININO;
		}
	}
	
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
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo="+ sexo +", idade=" + idade + ", endereco=" + endereco + "]";
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	

	
	
}