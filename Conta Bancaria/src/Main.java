
public class Main {

	public static void main(String[] args) {
		
		ConanBancaria conta1 = new ConanBancaria(true, 200, 213785);
		ConanBancaria conta2 = new ConanBancaria(true, 1000, 3897);
		
		conta1.Receber(1000);
		conta2.Receber(600);
		
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n%n",conta2.Ver());
		conta1.Dar(400);
		conta2.Receber(400);
		
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n%n",conta2.Ver());
		conta1.Dar(600);
		conta2.Receber(600);
		System.out.printf("O valor na conta 1 � de R$%.2f%n",conta1.Ver());
		System.out.printf("O valor na conta 2 � de R$%.2f%n%n",conta2.Ver());
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Rafael");
		cliente.setCPF(123456);
		cliente.setNumConta(1237763);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCPF());
		System.out.println(cliente.getNumConta());
	
	}

}
