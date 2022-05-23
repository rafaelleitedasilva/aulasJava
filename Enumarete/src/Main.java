
public class Main {
	
	//Cosntante do tipo primitivo
	public static final double PI = 3.14;
	//No enumerate nos conseguimos ter um conjunto maior de valores para um unico enum
	
	private enum Sexo{
		MASCULINO, FEMININO;
		
	}
	
	public static void main(String[] args) {
		
		//Chamando a constante e guardando o seu valor em uma variavel
		double numeroPi = Main.PI;
		
		//Utilizando a constante do enumerate
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		System.out.println(hoje);
		
		//Acessando o metodo pela constante SEGUNDA e retornando o valor inteiro armazenado nessa constante
		int num = DiaDaSemana.SEGUNDA.getNum();
		
		//criado uma variavel string com o valor TERCA
		String s = "TERCA";
		
		//Metodo de enum que permite converter valores na constante
		//e mudar um enum SEGUNDA para TERCA por exemplo
		hoje = DiaDaSemana.valueOf(s);
		
		//Mostrando o resultado das variaveis
		System.out.println(hoje);
		System.out.println(hoje.getNum());
		System.out.println(num);
		
		//Utilizando o enum criado no proprio arquivo main
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMININO;
		
		System.out.println(sexo);
	}

}
