
public class Pessoa {
//	atributos privados da classe Pessoa
	
	 private String nome;
	 private int idade;
//	atributo de tipo enum SEXO
	 private Sexo sexo;
//	  atributo de tipo Endereco
	 private Endereco endereco;
	 
	// <----- GET E SET dos atributos------>
	 
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
	
	// metodo de pessoa vazio que nao recebe parametro, para haver sobrecarga
	public Pessoa() {
		
	}
	// sobreposição do metodo to string 
	@Override
	public String toString() {
		
		//                                    0                      1           2                        3                                      4                                   5
		return "Cadastro de pessoa Nome = " + nome + ", Idade = " + idade+ ", Sexo = " + sexo + ", Endereco: " + endereco; // 

	}
	// sobrecarga com paramentros que recebe a string
	public Pessoa (String texto) {
		// aqui vai começar o tratamento da String.
		// Ela, primeiro sera quebrada nas virgulas. Depois, cada array vai receber a respectiva parte da string que tenha a info necessaria.
		// auxiliar 1 recebe a string inteira dividida por virgulas
		String[] arrayLinha = texto.split(",");
		
		// aux 2 recebe a aux 1 de indice 0, separado por iguais --- NOME
		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());
		
		String[] arraySexo = arrayLinha[2].split("=");
		this.sexo = Sexo.valueOf(arraySexo[1].trim());
		
		Endereco endereco = new Endereco(arrayLinha);
		this.endereco = endereco;

	}
	
	
	
}
