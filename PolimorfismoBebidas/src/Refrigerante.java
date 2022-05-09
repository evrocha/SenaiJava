
public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("Refrigerante", false);
		
	}

//	@Override subscrevendo o metodo preparar para as necessidades do Refrigerante
	public void preparar() {
		// chama o metodo preparar da supeclasse bebida. serve para mostrar o syso "pegando o o copo"
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando refrigerante");
		
	}

}
