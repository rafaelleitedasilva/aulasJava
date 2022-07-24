package heranca2D3D;

public class Ponto3D extends Ponto2D{
	//Atributo único dessa classe
	private double z;
	
	//Pega os pontos x e y da classe Ponto2D
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	//Faz o override do toString e adiciona o z
	//ja que o ponto3d extends do ponto2d nos utilizamos o super para puxar oq ja ta escrito no tostring do ponto2d
	@Override
	public String toString() {
		return super.toString() + "[z=" + z + "]";
	}
	
	
	
}
