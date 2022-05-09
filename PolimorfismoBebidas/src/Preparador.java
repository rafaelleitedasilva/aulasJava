
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		bebida.prepara();
		
		if(bebida.isQuente()) {
			System.out.printf("Aquecendo a bebida %s!%n", bebida.getNome());
		}
		
		System.out.printf("Bebida preparada ;P %n%n");
	}
	
}

