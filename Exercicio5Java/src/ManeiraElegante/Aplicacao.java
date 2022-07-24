package ManeiraElegante;

public class Aplicacao {

	public static void main(String[] args) {
		
		Cilindro cilindro1 = new Cilindro(10,5);
		Cilindro cilindro2 = new Cilindro(2,30);
		
		System.out.printf("O primeiro cilindro com %.0f de altura e %.0f de raio possui %.2f de volume. \n",cilindro1.getAltura(),cilindro1.getRaio(),cilindro1.VolumeCilindro());
		System.out.printf("O primeiro cilindro com %.0f de altura e %.0f de raio possui %.2f de volume. \n",cilindro2.getAltura(),cilindro2.getRaio(),cilindro2.VolumeCilindro());
	}

}
