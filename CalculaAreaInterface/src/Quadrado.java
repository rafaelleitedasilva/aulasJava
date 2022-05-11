
public class Quadrado implements AreaCalculavel{
	double lado;
	
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}




}
