
public class Triangulo implements AreaCalculavel {
	//Variáveis para calcular a área do triângulo
	double altura;
	double base;
	
	
	
	public double getAltura() {
		return altura;
	}


	//Método da circunferência que seta a altura
	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}


	//Método da circunferência que seta a base
	public void setBase(double base) {
		this.base = base;
	}

	//Override da assinatura de método na interface
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return (getBase()*getAltura())/2;
	}

}
