
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Eu instancio uma data com dia, mês, ano e hora
		Data d1 = new Data(20, 03, 2000, 21, 2, 3);
		//Imprimindo a data com difentes formatos
		d1.Imprimir(d1.FORMATO_12H);
		d1.Imprimir(d1.FORMATO_24H);
	}

}
