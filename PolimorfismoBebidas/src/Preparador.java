
public class Preparador {
// classe de passagem. essa classe é necessaria para todas as outras. Ela recebe informações e entrega o valor pedido
	public void prepararBebida(Bebida bebida) {
		System.out.println("\nPreparando a bebida " + bebida.getNome());
		bebida.preparar();
		// teste condicional para saber se a bebida é quente ou fria
		
		if (bebida.isAquecer()) {
			// se verdadeiro
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		System.out.println("Bebida preparada com sucesso!!!");
	}
}
