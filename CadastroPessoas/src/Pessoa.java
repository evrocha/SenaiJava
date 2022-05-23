
public class Pessoa {
//	
//	int idade; 
//	String nome;
//	Endereco endereco;
//	
//	public int getIdade() {
//		return idade;
//	}
//	public void setIdade(int idade) {
//		this.idade = idade;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public Endereco getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//	
//	
	int idade;
	String nome;
	Endereco endereco;
	Sexo sexo;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
//		return "Pessoa [idade=" + idade + ", nome=" + nome + ", endereco=" + endereco + ", sexo=" + sexo + "]";
		return "Cadastro de pessoa [idade=" + idade + ", Nome=" + nome + ", Endereco= " + " Rua: " + endereco.getRua() + " ,Número: "+ endereco.getNumero() + " ,Bairro: "+ endereco.getBairro()+", Sexo =" + sexo + "]";

	}
	
	
	
}
