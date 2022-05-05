// SUPERCLASSE
public class Veiculo {
//	private String nome;
	protected String marca; // as classes filhas têm acesso aos atributos com modificador de acesso protected
	protected String modelo;
	protected int ano;
	
	public void buzinar() {
		System.out.println("BI BI");
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "  + ano);
	}
}
