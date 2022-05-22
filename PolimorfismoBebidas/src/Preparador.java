
public class Preparador {
	
	//Preparador responsável por iniciar a preparação da bebida colocando ela no copo, e se for uma bebida quente, esquenta-la
	public void prepararBebida(Bebida bebida) {
		bebida.prepara();
		System.out.printf("Colocando %s no copo!%n", bebida.getNome());
		if(bebida.isQuente()) {
			System.out.printf("Aquecendo a bebida: %s!%n", bebida.getNome());
		}
		
		System.out.printf("Bebida preparada ;P %n%n");
	}
	
}

