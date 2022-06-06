
// classe que implementa a interface area calculavel
// com isso, todos os metodos da interface vem p/classe
public class Quadrado implements AreaCalculavel {
	// atributos da classe quadrado
	private int lado1;
	private int lado2;
	
	public Quadrado() {
		
	}
// <!--- METODOS  GET E SET
	public int getLado1() {
		return lado1;
	}
	
// metodo set vai pedir  parametro
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}
	
	// metodo set vai pedir  parametro
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	// Sobreposição do metodo to string para dar o retorno especifico
	@Override
	public void calcularArea() {
		System.out.println("O valor da área do quadrado é: " + getLado1()* getLado2());
		 
	}
		
	}
	
	

