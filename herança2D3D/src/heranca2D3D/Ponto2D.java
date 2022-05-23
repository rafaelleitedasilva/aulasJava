package heranca2D3D;

public class Ponto2D{
	//Atributos protegidos dessa classe que podem ser acessados por herdeiros
	protected double x;
	protected double y;
	
	public Ponto2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
}
