
// classe que implementa a interface area calculavel
// com isso, todos os metodos da interface vem p/classe
public class Triangulo implements AreaCalculavel {
	private int lado1;
	private int lado2;
	private int base;
	
	

	Triangulo(){
		
	}
	
	// <!-- METODO GET E SET --!>
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	// Sobreposi??o do metodo to string para dar o retorno especifico
	@Override
	public void calcularArea() {
		System.out.println("O valor da ?rea do tri?ngulo ?: " + (getLado1()* getLado2())/2);
		// TODO Auto-generated method stub
		
	}
	
}
