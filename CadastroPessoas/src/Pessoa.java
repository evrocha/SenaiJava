
public class Pessoa {
//	
String idade;
	String nome;
	Endereco endereco;
	Sexo sexo;
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
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
	
	public Pessoa() {
		
	}
	@Override
	public String toString() {
//		return "Pessoa [idade=" + idade + ", nome=" + nome + ", endereco=" + endereco + ", sexo=" + sexo + "]";
		
		
		//                                    0                      1           2                                             3                                      4                                   5
		return "Cadastro de pessoa [idade=" + idade + ", Nome=" + nome + ", Endereco= " + endereco;

	}
	public Pessoa (String texto) {
		
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.idade = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.nome = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.endereco.rua = arrayAuxiliar4[1].trim();

		String[] arrayAuxiliar5 = arrayAuxiliar1[3].split(":");
		this.endereco.numero = arrayAuxiliar5[1].trim();
		
		String[] arrayAuxiliar6 = arrayAuxiliar1[4].split(":");
		this.endereco.bairro = arrayAuxiliar6[1].trim();
		
		String[] arrayAuxiliar7 = arrayAuxiliar1[5].split("=");
		
		if (arrayAuxiliar1[5] == "MASCULINO") {
			this.sexo = Sexo.MASCULINO;
		}
		else {
			this.sexo = Sexo.FEMININO;
		}
		
	}
	
	
	
}
