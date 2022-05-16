//superclasse que representa uma classe abstrata. 
public abstract class ContaBancaria {
	
	// saldo da conta
	protected double saldo;
	
	
	// deposita determinado valor na conta
	public void depositar(double valor) {
		saldo -= valor;
	}
	
	// saca determinado valor na conta
	public void sacar(double valor) {
		saldo += valor;
	}
	
	// Transfere um valor de determninada conta para outra
	public void transferir(double valor, ContaBancaria conta) {
		conta.sacar(valor);;
		conta.depositar(valor);
		
		
	}
	// regra do calculo do saldo final
	// cada subclasse devera fazer um override deste meto para usa-lo de acordo com o tipo de conta
	public abstract void calcularSaldo();
}
