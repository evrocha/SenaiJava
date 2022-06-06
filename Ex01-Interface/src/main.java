
public class main {

	public static void main(String[] args) {
		// atributos de tipo da classe referente
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		
		// atribuindo valores via parametros ao objeto quadrado
		quadrado.setLado1(10);
		quadrado.setLado2(20);
		// metodo que faz o calculo da area
		quadrado.calcularArea();
		
		// atribuindo valores via parametros ao objeto retangulo
		retangulo.setAltura(5);
		retangulo.setBase(2);
		// metodo que faz o calculo da area
		retangulo.calcularArea();
		
		// atribuindo valores via parametros ao objeto de triangulo
		triangulo.setBase(5);
		triangulo.setLado1(10);
		triangulo.setLado2(9);
		// metodo que faz o calculo da area
		triangulo.calcularArea();
	}
	


}
