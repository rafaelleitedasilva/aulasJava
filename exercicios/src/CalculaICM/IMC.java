package CalculaICM;

public class IMC {
	Pessoa pessoa;
	
	static public double CalculaICM(Pessoa pessoa) {
		pessoa.setIcm(pessoa.getPeso()/Math.pow(pessoa.getAltura(), 2));
		return pessoa.getPeso()/Math.pow(pessoa.getAltura(), 2);
	}
	
	static public void SetClassificacao(Pessoa pessoa) {
		if (pessoa.getIcm() == 0) {
			System.out.println("Faça o calculo de ICM para ter a sua classificação!");
		} else if (pessoa.getIcm() <= 18.5) {
			pessoa.classificacao = "Abaixo do Peso";
		} else if (pessoa.getIcm() <= 24.9) {
			pessoa.classificacao = "Peso Normal";
		} else if (pessoa.getIcm() <= 29.9) {
			pessoa.classificacao = "Sobrepeso";
		} else if (pessoa.getIcm() <= 34.9) {
			pessoa.classificacao = "Obseidade Grau I";
		} else if (pessoa.getIcm() <= 39.9) {
			pessoa.classificacao = "Obseidade Grau II";
		} else if (pessoa.getIcm() >= 40) {
			pessoa.classificacao = "Obseidade Grau III";
		} else {
			System.out.println("IMC inválido, por favor reveja as informações!");
		}
	}
}
