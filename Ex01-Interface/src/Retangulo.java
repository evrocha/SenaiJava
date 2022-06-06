
// classe que implementa a interface area calculavel
// com isso, todos os metodos da interface vem p/classe
public class Retangulo implements AreaCalculavel {
	// atributos da classe
	private int base;
	private int altura;
	// metodo que nao recebe parametros
	public Retangulo() {
		
	}
	
	// <!-- METODO GET E SET --!>
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	// Sobreposição do metodo to string para dar o retorno especifico
	@Override
	public void calcularArea() {
		System.out.println("O valor da área do retângulo é: " + getBase()* getAltura());
			}
	
}
