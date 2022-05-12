//import java.util.Scanner;

public class Quadrado implements AreaCalculavel {
	private int lado1;
	private int lado2;
	
	public Quadrado() {
		
	}

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

	@Override
	public void calcularArea() {
		System.out.println("O valor da área do quadrado é: " + getLado1()* getLado2());
		 
	}
		
	}
	
	

