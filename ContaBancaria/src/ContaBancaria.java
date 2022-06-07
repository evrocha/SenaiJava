
public class ContaBancaria {
	
	private int numConta;
	private double saldo;
	private boolean ativo;
	
	
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}
	

	public ContaBancaria( double saldo, boolean ativo) {
		
		
		this.saldo = saldo;
		this.ativo = ativo;
	}


	public void receba(double valor) {
		saldo += valor;
		
	}
	
	public double verSaldo() {
		return saldo;
		
	}
	public void dar(double valor) {
		
		if(saldo>=valor)
			saldo -= valor;
		
	}

}
