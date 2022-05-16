//subclasse
public class ContaCorrente extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		saldo = saldo - (10/100);
		super.calcularSaldo();
	}

	@Override
	public void depositar(double valor) {
		saldo += this.saldo;
//		super.depositar(saldo);
	}

	@Override
	public void sacar(double valor) {
		saldo -= this.saldo;
//		super.sacar();
	}

	@Override
	public void transferir(double saldo, ContaBancaria contabancaria) {
		// TODO Auto-generated method stub
//		super.transferir();
	}

}
