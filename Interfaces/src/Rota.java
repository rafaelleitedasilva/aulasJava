
public class Rota {
	
	//M�todo que vai gerar a rota do Automovel
	public void rotaAlmanaque(Automovel automovel) {
		
		automovel.abrirPorta();
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.freiar();
		System.out.println("");
		
	}
	
}
