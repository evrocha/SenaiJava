
public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double  saldo;
//  visibilidade	retorno  nome  tipo da var   parametro
	//  nao fazer o retorno no metodo recber porque é mlhor q as tareas estejam bem dividididas entre os metodos

	public void receber(double valor) { //metodo q só recebe  e atribui o valor ao saldo
		saldo += valor;	
	} 
	public double saldo(){
		return saldo;
	}
	
	public void dar(double valor) {
		if (saldo>=valor) {
			saldo-= valor;
		}
	}
	// botao direito na folha>source> generate using fields e altera a inicialização
	public ContaBancaria() {
		ativo = true;
		saldo = 1d;
	}
	
	// metodos com mesmo nome = == = == SOBRECARGA
	// construtores com parametros. ao especifica os parametros ele ntra nesse metodo construtor em especifico
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}
	
}