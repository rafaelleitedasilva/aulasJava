package fundamentos;

public class ProgramaRevisao {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Rafael", 1800.21);
		Funcionario funcionario2 = new Funcionario("Jose", 1300.21);
		
		System.out.printf("A média de salário entre o %s e %s é: R$%.2f", funcionario1.getNome(), funcionario2.getNome(), funcionario1.mediaSalario(funcionario2));

	}

}
