
public class Onibus extends Veiculo{
	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("O Onibus está ligado.");
		} else {
			System.out.println("O Onibus está desligado.");
		}
		return true;
	}
}
