
public class ContaBancaria {
	private int numConta;
	private double saldo;
	private boolean ativo;
	private double limite;
	
	
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
		numConta = 1;
	}

	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaBancaria(double saldo, boolean ativo, int numConta) {
		this.saldo = saldo;
		this.ativo = ativo;
		this.numConta = numConta;
	}


	public ContaBancaria(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}


	public void receba(double valor) {
		saldo += valor;
	}
	
	public double verSaldo() {
		return saldo;
		
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	
	// ------ testes boolenos --------------
	public boolean sacar(double valor) {
			// tratamento booleano
		if(saldo>=valor) {
			saldo -= valor;
			System.out.println("Você transferiu o valor R$" + valor);
			return true;
		}
		else {
			System.out.println("Você não tem dinheiro o suficiente na conta.");
			System.out.println("ERRO 404 -  MONEY NOT FOUND");
			return false;
		}
	}
	
	public boolean transferir(Cliente cliente, double valor) {
		if(saldo<valor) {
			return false;
		}
		this.saldo-= valor;
		cliente.getConta().depositar(valor);
		return true;
	}

	
	// CÓDIGOS USANDO MAGIC NUMBER
	public int sacarMN(double valor) {
		if ((saldo<valor) && (this.saldo>=limite*-1)) {
			return 404; // se saldo menor retorna 404
		}
		else if(this.saldo>= limite*-1) {
			return 101;
		}
		return 102;	
	}
	
	
	public int transferirMN(Cliente cliente, double valor) {
		if((this.saldo<valor) && (valor>=limite*-1)) {
			this.saldo-= valor;
			return 404;
		}
		else if((this.saldo < valor) && (this.saldo>=limite *-1)) {
			return 102;
		}
		this.saldo-= valor;
		cliente.getConta().depositar(valor);
		return 100;
		
	}

	
	// USANDO O EXCEPTION
	
	public void sacarEX(double valor) throws ContaBancariaException {
		if(this.saldo < valor) {
			throw new ContaBancariaException("Saldo insuficiente");
		}
		else if((this.saldo - valor) < limite *-1) {
			throw new ContaBancariaException("Limite Insuficiente");
			
		} 
		this.saldo =- valor;
	}
	
	


}
