package CalculaICM;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1.90, 72);
		Pessoa pessoa2 = new Pessoa(1.76, 100);
		Pessoa pessoa3 = new Pessoa(1.60, 45);
		
		System.out.printf("IMC da pessoa 1: %.2f \n" , IMC.CalculaICM(pessoa1));IMC.SetClassificacao(pessoa1);
		System.out.printf("IMC da pessoa 2: %.2f \n" , IMC.CalculaICM(pessoa2));IMC.SetClassificacao(pessoa2);
		System.out.printf("IMC da pessoa 3: %.2f \n\n" , IMC.CalculaICM(pessoa3));IMC.SetClassificacao(pessoa3);
		
		System.out.printf("Classificação da pessoa 1: %s \n", pessoa1.classificacao);
		System.out.printf("Classificação da pessoa 2: %s \n", pessoa2.classificacao);
		System.out.printf("Classificação da pessoa 3: %s \n", pessoa3.classificacao);
	}

}
