
public enum DiaDaSemana {
	
	//O valor entre os parenteses e o valor que esta associado a constante
	//Cada uma dessas constantes vai virar um objeto
	
	//Como o enum e um tipo de dado podemos ter atributos e metodos
	
	DOMINGO (1),
	SEGUNDA (2),
	TERCA (3),
	QUARTA (4),
	QUINTA (5),
	SEXTA (6),
	SABADO (7);
	
	
	//Como o atributo e privado precisamos criar o get
	//Cada constante possui o seu valor inteiro pre-setado
	//Conseguimos retornar esse valor, mas nao setar um valor por cima
	public int getNum() {
		return num;
	}

	//Para setar o valor do atributo para cada constante eu preciso criar um construtor
	private int num;

	private DiaDaSemana(int num) {
		this.num = num;
	}
	
	
}
