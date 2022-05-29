public class Endereco {
	//Criando as variaveis da classe endereco
	private int num;
	private String rua;
	private String bairro;
	
	//Criando os get and set dos atributos, atraves do source
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	//Override do metodo toString que antes mostrava o endereco da classe e nao os seus valores
	@Override
	public String toString() {
		return " [num=" + num + ", rua=" + rua + ", bairro=" + bairro;
	}

	
	
	
}