
public  abstract class ContaBancaria {

	protected double saldo = 100;
	
	
	
	public void depositar(double x) {
		saldo += x;
		System.out.println("Voc� depositou 90 reais, agora seu saldo eh:" + saldo);
	}
	
	public void Sacar(double x) {
		saldo -= x;
		System.out.println("Voc� sacou 90 reais, agora seu saldo eh:" + saldo);
	}

	public void transferir(double x, ContaBancaria c2) {
		saldo -= x;
		c2.saldo += x;
		System.out.println("Voc� Transferiu 90 reais, agora seu saldo eh:" + saldo);
		
		
	}
	
	public abstract double CalcularSaldo();
		
	

}



