
public class Vendedor {
	//Método que pega um item que herda de ItemCaro e 
	//mostra o seu preço pelo método getPreco() 
	
	public void mostrarPreco(ItemCaro caro) {
		//Printf para formatar a informação de getPreco()
		System.out.printf("O valor é R$%.2f%n", caro.getPreco());
	}
}
