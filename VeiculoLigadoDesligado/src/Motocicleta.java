
public class Motocicleta extends Veiculo {
	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("A motocicleta está ligada.");
		} else {
			System.out.println("A motocicleta está desligada.");
		}
		return true;
	}
}
