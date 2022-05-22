
public class Cogumelo extends Item{
	//Override da assinatura de método com "super.pegar()" que garante trazer os elementos que já estavam no método da classe abstrata principal.
	
	@Override
	public void pegar() {
		// TODO Auto-generated method stub
		super.pegar();
		System.out.println("Pegar Cogumelo!");
	}

}
