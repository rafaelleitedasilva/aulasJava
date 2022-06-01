public class Pessoa {
	//CRIANDO UM ENUM BASICO PARA O SEXO DA PESSOA
	private enum Sexo{
		FEMININO, MASCULINO;
	}
	
	//ATRIBUTOS DA PESSOA
	private String nome;
	private String idade;
	private Endereco endereco;
	private Sexo sexo;
	
	//METODO QUE VAI VERIFICAR O SEXO DA PESSOA DEPENDENDO DO NUMERO ESCOLHIDO
	public void sexoNum(int sexo) {
		if(sexo == 1) {
			this.sexo=Sexo.FEMININO;
		}
		else if(sexo == 2) {
			this.sexo=Sexo.MASCULINO;
		}	else {
			System.out.println("Valor Inválido: 1 - Feminino | 2 - Masculino");
		}
	}
	
	//CRIANDO OS GET AND SET DOS ATRIBUTOS DA PESSOA, POR CONTA DELES SEREM PRIVADOS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	public Sexo getSexo() {
		return sexo;
	}

	//OVERRIDE DO TO STRING PARA QUE POSSAMOS TER UMA VISUALIZAÇÃO DOS DADOS QUANDO
	//CHAMAMOS O OBJETO
	@Override
	public String toString() {
		return "|Nome: " + nome + " ,Idade: " + idade + " ,Sexo: " + sexo + endereco;
	}

	//PESSOA COM CONSTRUTOR RECEBENDO INTEIRO APENAS PARA QUE NAO OCORRA A OBRIGATORIEDADE DE SE COLOCAR
	//UMA STRING QUANDO ESTIVERMOS INSTANCIANDO AS CLASSES
	public Pessoa(int x) {
	}

	//CRIANDO O CONSTRUTOR QUE VAI RECEBER O OBJETO EM FORMA DE STRING
	public Pessoa(String texto) {
		
		//QUEBRA DA STRING NAS VIRGULAS E ARMAZENAMENTO
		String[] arrayAuxiliar1 = texto.split(",");
		
		//QUEBRA DA STRING NO DOIS PONTOS E RETIRADA DOS ESPAÇOS VAZIOS
		//E ARMAZENAMENTO NO ATRIBUTO
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.nome = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.idade = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split(":");
		String nu = arrayAuxiliar4[1].trim();

		//OUTRO IF-ELSE QUE VAI RECEBER O VALOR DO MASCULINO OU FEMININO E CONVERTER ELE PARA
		//O TIPO ENUM DE SEXO
		if(nu == "MASCULINO") {
			this.sexo= Sexo.MASCULINO;
		}else {
			this.sexo= Sexo.FEMININO;
		}
		
		//INSTANCIANDO O ENDERECO NOVAMENTE POR CONTA DELE TAMBEM SE RUMA CLASSE
		String[] arrayAuxiliar5 = arrayAuxiliar1[3].split(":");
		this.endereco = new Endereco(arrayAuxiliar5[1]);


	}
	
}