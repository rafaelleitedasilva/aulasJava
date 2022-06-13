import java.util.Objects;

public class Pessoa {

	//Atributos do cliente

	private String nome;
	private int CPF;
	private int numConta;
	
	//Criando os métodos para a crianção de um cliente
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	//Fazendo o override de classes inerentes ao objeto pai (Object)
	//Formatando o toString() para mostrar os valores do Cliente e não seu endereço
	@Override
	public String toString() {
		return "\nCliente: \nNome=" + nome + ",\nCPF=" + CPF + ",\nN�mero da Conta=" + numConta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, nome, numConta);
	}
	

	//Fazendo o override de equals() para que ele compare os atributos de dois objetos tipo Cliente()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return CPF == other.CPF && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
	
	
	
	
}
