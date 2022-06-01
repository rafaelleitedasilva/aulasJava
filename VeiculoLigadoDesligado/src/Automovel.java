
public class Automovel extends Veiculo {

	//OVERRIDE DO METODO ISLIGADO QUE VEIO DA CLASSE PAI VEICULO
	@Override
	public boolean isLigado() {
		//SE O METODO DA CLASSE PRINCIPAL RETORNA UM VALOR VERDADEIRO É PRINTADO QUE O AUTOMOVEL ESTA LIGADO
		if (super.isLigado()==true) {
			System.out.println("O automóvel está ligado.");
		} else {
		//E SE O RETORNO FOR UM VALOR FALSO É PRINTADO QUE O AUTOMOVEL ESTA DESLIGADO
			System.out.println("O automóvel está desligado.");
		}
		return true;
	}
	
}
