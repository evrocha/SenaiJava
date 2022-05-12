
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		
		quadrado.setLado1(10);
		quadrado.setLado2(20);
		quadrado.calcularArea();
		
		retangulo.setAltura(5);
		retangulo.setBase(2);
		retangulo.calcularArea();
		
		triangulo.setBase(5);
		triangulo.setLado1(10);
		triangulo.setLado2(9);
		triangulo.calcularArea();
	}
	


}
