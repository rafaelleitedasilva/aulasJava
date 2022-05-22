
public class Veiculo {
	//Como todas as outras classes herdam de Veiculo
	//todas as outras classes podem fazer o override dos seus métodos
	//ou ter acesso a atributos tipo "protected"
	private String nome = "teste";
	protected String modelo;
	protected int ano;
	protected String marca;
	
	//Métodos que serão herdados pelas classes
	public void buzinar() {
		System.out.printf("BI FON!%n%n");
	}
	
	public void imprimir() {
		System.out.printf("Marca: %s%nModelo: %s%nAno: %d%n", marca, modelo, ano);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
