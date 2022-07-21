package CalculaICM;

public class Pessoa {
	private double altura;
	private double peso;
	private double icm = 0;
	String classificacao = "Ainda não classificado!";
	
	
	public Pessoa(double altura, double peso) {
		this.setAltura(altura);
		this.setPeso(peso);
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getIcm() {
		return icm;
	}


	public void setIcm(double icm) {
		this.icm = icm;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
