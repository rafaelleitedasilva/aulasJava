
public class Onibus extends Veiculo{
	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("O Onibus est� ligado.");
		} else {
			System.out.println("O Onibus est� desligado.");
		}
		return true;
	}
}
