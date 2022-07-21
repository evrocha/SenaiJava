package fundamentos;

public class Pessoas {
	private String nome;
	private float salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", salario=" + salario + "]";
	}
}
