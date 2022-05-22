
public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciando os veiculos
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();
		
		//Setando os atributos do veiculo
		veiculo.setAno(2010);
		veiculo.setMarca("Mercedes");
		veiculo.setModelo("Beans");
		carro.setQuatroPortas(true);
		
		//Setando os valores do caminhão
		caminhao.setAno(2019);
		caminhao.setMarca("Scania");
		caminhao.setModelo("Extra Grande");
		
		//Setando os valores do carro
		carro.setAno(2015);
		carro.setMarca("Honda");
		carro.setModelo("City");
		
		//Setando os valores da moto
		moto.setAno(2012);
		moto.setMarca("Ninja");
		moto.setModelo("Dragon");
		
		//Imprimindo os atributos dos veículos e fazendo ações específicas de cada classe
		carro.imprimir();
		moto.imprimir();
		moto.empinar();
		caminhao.imprimir();
		caminhao.buzinar();

	}

}
