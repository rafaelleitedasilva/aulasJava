
public class Data {
	private int hora = -1;
	private int minuto;
	private int segundo;
	private int dia;
	private int mes;
	private int ano;
	public static final boolean FORMATO_12H = true;
	public static final boolean FORMATO_24H = false;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void Imprimir(boolean formato) {
		
		if(formato == true && hora >= 0 && hora<=12) {
			System.out.printf("%d/%d/%d %d:%d:%d AM %n", dia, mes, ano, hora, minuto, segundo);
		}else if(formato == true && hora >= 0 && hora <= 23 && hora>12) {
			System.out.printf("%d/%d/%d %d:%d:%d PM %n", dia, mes, ano, hora%12, minuto, segundo);
		}else if (formato == false && hora>=0 && hora<23){
			System.out.printf("%d/%d/%d %d:%d:%d %n", dia, mes, ano, hora%24, minuto, segundo);
		}else if(hora == -1) {
			System.out.printf("%d/%d/%d %n", dia, mes, ano);
		}
	}
}
