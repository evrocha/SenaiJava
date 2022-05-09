
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite quente", true);
		
	}

//	@Override subscrevendo o metodo preparar para as necessidades do LeiteQuente

	public void preparar() {
		System.out.println("Colocando o leite no copo");

	}

}
