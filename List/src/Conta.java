
public class Conta {
	String nome;
	double valor;
	
	// recebe estes dois parametros
	public Conta(String nome, double valor) {
		
		this.nome = nome;
		this.valor = valor;
	}

	// sobscreve a String de Object
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
