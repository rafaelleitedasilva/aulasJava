package ManeiraElegante;

public class Cilindro {
	private double altura;
	private double raio;
	
	public Cilindro(double altura, double raio) {
		super();
		this.altura = altura;
		this.raio = raio;
	}
	
	public double VolumeCilindro() {
		return Math.PI*Math.pow(this.raio, 2)*this.altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
