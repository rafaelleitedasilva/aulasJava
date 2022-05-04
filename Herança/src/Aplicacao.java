
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();
		
		veiculo.setAno(2010);
		veiculo.setMarca("Mercedes");
		veiculo.setModelo("Beans");
		carro.setQuatroPortas(true);
		
		caminhao.setAno(2019);
		caminhao.setMarca("Scania");
		caminhao.setModelo("Extra Grande");
		
		carro.setAno(2015);
		carro.setMarca("Honda");
		carro.setModelo("City");
		
		moto.setAno(2012);
		moto.setMarca("Ninja");
		moto.setModelo("Dragon");
		
		carro.imprimir();
		
		moto.imprimir();
		moto.empinar();
		
		caminhao.imprimir();
		caminhao.buzinar();

	}

}
