
public class Circunferencia implements AreaCalculavel{

	//Variáveis da circunferência necessárias para fazer o cálculo
	double raio;
	double pi = 3.1415;
	
	
	//Método da circunferência que retorna o raio
	public double getRaio() {
		return raio;
	}

	//Método da circunferência que seta o raio
	public void setRaio(double raio) {
		this.raio = raio;
	}


	//Override da assinatura de método na interface
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return (pi*raio*raio);
	}

	

}
