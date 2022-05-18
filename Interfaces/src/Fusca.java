
public class Fusca implements Carro{

	//Override de todos os métodos de Carro que extends de Automovel
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a esquerda");
	}
	
	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a direita");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Fusca acelerou");
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		System.out.println("Fusca freiou");
	}

	@Override
	public void abrirPorta() {
		System.out.println("Abrir porta");
		
	}

}
