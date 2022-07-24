package calculadoraDeDesconto;

public class Calculadora {
	static public double CalculaDesconto(double valor, double desconto) {
		return valor - (valor*desconto);
	}
}
