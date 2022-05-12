
public class Retangulo implements AreaCalculavel {
	private int base;
	private int altura;
	public Retangulo() {
		
	}
	
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

	@Override
	public void calcularArea() {
		System.out.println("O valor da área do retângulo é: " + getBase()* getAltura());
			}
	
}
