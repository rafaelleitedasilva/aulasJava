public class Endereco {
	private String rua;
	private String num;
	private String bairro;
//	Criando as variaveis utilizadas em endereco
	
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
	
	@Override
	public String toString() {
		return ",Endereço: " + rua + "-" + num + "-" + bairro;
	}
//	Como sao atributos privados criamos o get e set
	public Endereco(int x) {

	}
//	Aqui o construtor nos obrigaria a colocar o valor na construcao do obj
	
	public Endereco(String texto) {
		String[] arrayAuxiliar1 = texto.split("-");
		
		this.rua = arrayAuxiliar1[0].trim();

		this.num = arrayAuxiliar1[1].trim();
		
		this.bairro = arrayAuxiliar1[2].trim();
	}
//		Aqui quebramos e tiramos os espaços do conteudo do txt

}