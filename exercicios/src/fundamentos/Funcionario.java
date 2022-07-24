package fundamentos;

public class Funcionario {
	String nome;
	double salario;
	Funcionario funcionario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double mediaSalario(Funcionario funcionario) {
		return (this.salario + funcionario.salario)/2;
	}
}
