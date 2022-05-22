
public class Motocicleta extends Veiculo {
	//Todas as classes QUE EXTENDEM de veículo possuem um override de isLigado
	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("A motocicleta est� ligada.");
		} else {
			System.out.println("A motocicleta est� desligada.");
		}
		return true;
	}
}
