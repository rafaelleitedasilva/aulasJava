
public class Motocicleta extends Veiculo {
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
