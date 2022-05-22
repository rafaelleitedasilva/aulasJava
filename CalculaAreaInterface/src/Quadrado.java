
public class Quadrado implements AreaCalculavel{
	double lado;
	
	
	public double getLado() {
		return lado;
	}


	//Método da circunferência que seta o lado
	public void setLado(double lado) {
		this.lado = lado;
	}


	//Override da assinatura de método na interface
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}




}
