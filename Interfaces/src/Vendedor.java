
public class Vendedor {
	//M�todo que pega um item que herda de ItemCaro e 
	//mostra o seu pre�o pelo m�todo getPreco() 
	
	public void mostrarPreco(ItemCaro caro) {
		//Printf para formatar a informa��o de getPreco()
		System.out.printf("O valor � R$%.2f%n", caro.getPreco());
	}
}
