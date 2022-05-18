public class Ferrari implements Carro, ItemCaro{
	int velocidade;
	
	//Override de todos os métodos de Carro que extends de Automovel
	//E override de ItemCaro que obriga a implementação de getPreco()
	
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou para a esquerda");
		
	}

	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou para a direita");
		
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari acelerou");
		
		
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari freiou");
		
		
	}

	@Override
	public void abrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Abrir porta!");
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	
}
