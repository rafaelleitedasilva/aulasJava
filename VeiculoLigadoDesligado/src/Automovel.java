
public class Automovel extends Veiculo {

	@Override
	public boolean isLigado() {
		if (super.isLigado()==true) {
			System.out.println("O autom�vel est� ligado.");
		} else {
			System.out.println("O autom�vel est� desligado.");
		}
		return true;
	}
	
}
