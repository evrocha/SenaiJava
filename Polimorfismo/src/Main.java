
public class Main {

	public static void main(String[] args) {
//		Cachorro cachorro  = new Cachorro();
//		cachorro.falar();
//		
//		System.out.println();
//		
//		Gato gato  = new Gato();
//		gato.falar();
// animal do tipo Animal instanciado  em gato
//		Animal animal = new Cachorro();
//		
//		animal.falar();
//		
//		animal = new Gato();
//		animal.falar();
//	}
//
//	public void falar() {
//		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		falar(gato);
		falar(cachorro);
	}

	private static void falar(Animal a) {
		a.falar();
		
		// comparador de instancias
		// se objeto a for da classe cachorro
		if(a instanceof Cachorro) {
			// variavel c do tipo cachorro -- força a variavel  a para dentro da variavel c (casting explicito)
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
		
	}
}
