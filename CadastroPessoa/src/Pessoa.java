
public class Pessoa {

	//Atributos da pessoa
	private String nome;
	private int idade;
	//endereco do tipo Endereco, por enquanto sem um endereco de classe setado
	private Endereco endereco;
	//sexo do tipo Sexo que é um enum
	Sexo sexo;
	
	//Metodo da Pessoa que checa o resultado no Main e define o sexo da pessoa dependendo do numero
	public void sexoNum(int num) {
		if(num == 1) {
			sexo = sexo.MASCULINO;
		}else {
			sexo = sexo.FEMININO;
		}
	}
	
	//Set and Get dos atributos, por eles serem privados
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
	
	//override do toString para nao mostrar o endereco da classe na hora de printar no foreach
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo="+ sexo +", idade=" + idade + endereco + "]";
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Sexo getSexo() {
		return sexo;
	}
	
	
	

	
	
}