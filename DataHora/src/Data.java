
public class Data {
	//Atributos privados que só serâo modificados durante a construção da classe
	private int hora = -1;
	private int minuto;
	private int segundo;
	private int dia;
	private int mes;
	private int ano;
	public static final boolean FORMATO_12H = true;
	public static final boolean FORMATO_24H = false;
	

	//Construtor para apenas dia, mes e ano
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	//Construtor para dia, mes, ano, hora, minuto e segundo
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Imprimindo a data com diferentes formatos
	public void Imprimir(boolean formato) {
		//Se o formato for 12Horas e eu tiver um horário menor que meio dia eu apenas coloco AM e as horas
		if(formato == true && hora >= 0 && hora<=12) {
			System.out.printf("%d/%d/%d %d:%d:%d AM %n", dia, mes, ano, hora, minuto, segundo);
		}//Se o foramto for de 12horas e a hora for maior que meio dia eu faço a divisão por resto da hora
		else if(formato == true && hora >= 0 && hora <= 23 && hora>12) {
			System.out.printf("%d/%d/%d %d:%d:%d PM %n", dia, mes, ano, hora%12, minuto, segundo);
		}//Se o formato for 24horas eu apenas mostro as informações
		else if (formato == false && hora>=0 && hora<23){
			System.out.printf("%d/%d/%d %d:%d:%d %n", dia, mes, ano, hora%24, minuto, segundo);
		}//E se a hora não for setada eu mostro apenas o dia, mes e ano
		else if(hora == -1) {
			System.out.printf("%d/%d/%d %n", dia, mes, ano);
		}
	}
}
