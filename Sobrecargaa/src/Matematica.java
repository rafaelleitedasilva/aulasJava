
public class Matematica {
	//Os métodos somar aqui dividem o mesmo nome, mas possuem parâmetros diferentes
	//Se eles fossem idênticos o Java daria um erro
	int somar(int x, int y) {
		return x + y;
	}
	
	int somar(int x, int y, int z) {
		return x + y + z;
	}
	
	double somar(double x, double y) {
		return x+y;
	}
}
