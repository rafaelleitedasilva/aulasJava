
public class Automovel extends Veiculo {

	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("O automóvel está ligado.");
		} else {
			System.out.println("O automóvel está desligado.");
		}
		return true;
	}
	
}
