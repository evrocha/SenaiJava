
public class main {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada(true);
		System.out.println(lampada1.imprimir());
		lampada1.desligar();
//		lampada1.ligar();
		System.out.println(lampada1.imprimir());
	}

}
