
public class Main {

	public static void main(String[] args) {
		
		
	ContaBancaria conta1 = new ContaBancaria(1000.0, 100.0);	
	ContaBancaria conta2 = new ContaBancaria(1500.0, 200.0);	
	
	Cliente cliente1 = new Cliente("Emanuel", 3333333, conta1);
	Cliente cliente2 = new Cliente("Gislene", 44444, conta2);

	// -------- TSTE BOOLEANO --------
	if(cliente1.getConta().sacar(100)==true) {
		System.out.println("Saque realizado com sucesso!");
		
	}
	else {
		System.out.println("Seu saque não foi realizado porque é insuficiente!!!");
	}
	System.out.println("Seu saldo atual é de: R$"+ cliente1.getConta().getSaldo());
	
	// --------- TESTE MAGIC NUMBER
	switch(cliente1.getConta().sacarMN(100)) {
		case 404: System.out.println("Saque realizado com sucesso!");
			break;
		case 101: System.out.println("Saque realizado com sucesso com utilização do limite");
			break;
		case 102: System.out.println("Operação não realizada por não ter saldo suficiente");
			break;
	}
	// ----------- TESTE COM EX
	try {
		cliente1.getConta().sacarEX(2000);
		System.out.println("saque realizado com sucesso");
	}
	
	// capturar
		catch 
				// cria a var de conbanc ex
		(ContaBancariaException e) {
		// escreve no console o erro. ERRO EM VERMELHO, PADRAO
		e.printStackTrace();
		// caso queira que o usuario continue a mexer no sistema normalmente
		System.out.println("Não foi possívl realizar a operação : " + e.getMessage());
	}
	
	
	
	
		}
	}