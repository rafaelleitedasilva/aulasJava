
public class Triangulo implements AreaCalculavel {
	double altura;
	double base;
	
	
	
	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return (getBase()*getAltura())/2;
	}

}
