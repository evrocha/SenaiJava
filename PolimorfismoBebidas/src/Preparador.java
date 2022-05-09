
public class Preparador {
// classe de passagem. essa classe � necessaria para todas as outras. Ela recebe informa��es e entrega o valor pedido
	public void prepararBebida(Bebida bebida) {
		System.out.println("\nPreparando a bebida " + bebida.getNome());
		bebida.preparar();
		// teste condicional para saber se a bebida � quente ou fria
		
		if (bebida.isAquecer()) {
			// se verdadeiro
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		System.out.println("Bebida preparada com sucesso!!!");
	}
}
