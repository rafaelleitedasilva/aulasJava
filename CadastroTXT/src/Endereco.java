public class Endereco {
	//CRIANDO AS VARIAVEIS PRIVADAS DO ENDERECO
	private String rua;
	private String num;
	private String bairro;

	//GET AND SET DOS ENDERECOS
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	//OVERRIDE DO TOSTRING PARA VISUALIZACAO DOS DADOS
	@Override
	public String toString() {
		return ",Endereço:" + rua + "-" + num + "-" + bairro;
	}
	
	//CRIANDO O CONSTRUTOR NULO PARA QUE NAO OCORRA OBRIGATORIEDADE DE DADOS NA HORA DE INSTANCIAR
	//A CLASSE, E CLARO QUE EXISTE FORMAS MAIS INTELIGENTES DE SE FAZER ISSO...
	public Endereco(int x) {

	}

	//MESMA QUEBRA DE STING QUE ACONTECE NA PESSOA, COMO NA PESSOA UTILIZAMOS O PIPE PARA SEPARAR,
	//AQUI USAMOS O TRAVESSAO PARA QUE NAO OCORRA CONFLITOS NETRE AS QUEBRAS
	public Endereco(String texto) {
		String[] arrayAuxiliar1 = texto.split("-");
		
		this.rua = arrayAuxiliar1[0].trim();

		this.num = arrayAuxiliar1[1].trim();
		
		this.bairro = arrayAuxiliar1[2].trim();
		System.out.println(arrayAuxiliar1);
	}


}