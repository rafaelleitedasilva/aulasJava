
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.printf("Preparando a bebida, %s%n", bebida.getNome());
		
		if(bebida.isQuente()) {
			System.out.printf("Aquecendo a bebida %s!%n", bebida.getNome());
		}
		
		System.out.printf("Bebida preparada com sucesso!%n%n");
	}
	
}

