package heranca2D3D;

public class Ponto2D{
	//Atributos protegidos dessa classe que podem ser acessados por herdeiros
	protected double x;
	protected double y;
	
	//o construtor da classe
	public Ponto2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	//o override do tostring
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}
