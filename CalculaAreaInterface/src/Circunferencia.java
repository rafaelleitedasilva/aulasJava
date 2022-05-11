
public class Circunferencia implements AreaCalculavel{
	double raio;
	double pi = 3.14;
	
	
	
	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return (pi*raio*raio);
	}

	

}
