//subclasse

public class ContaInvestimento extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		saldo = saldo + (5/100);
		super.calcularSaldo();
	}

	@Override
	public void depositar(double saldo) {
		saldo += this.saldo;
//		// TODO Auto-generated method stub
//		super.depositar(saldo);
	}

	@Override
	public void sacar(double saldo) {
		saldo -= this.saldo;
//		// TODO Auto-generated method stub
//		super.sacar();
	}

	@Override
	public void transferir(double saldo, ContaBancaria contabancaria) {
//		// TODO Auto-generated method stub
//		super.transferir();
	}

}
