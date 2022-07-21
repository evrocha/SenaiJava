package empresa;

public class Salario {
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
	public Salario() {
	}
	public float calculaMedia() {
		return salario = getSalario()/2;
	}
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", salario=" + salario + "]";
	}
}
