package heran�a2D3D;

public class Ponto3D extends Ponto2D{
	//Atributo único dessa classe
	private double z;
	
	//Pega os pontos x e y da classe Ponto2D
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	//Faz o override do toString e adiciona o z
	@Override
	public String toString() {
		return super.toString() + "[z=" + z + "]";
	}
	
	
	
}
