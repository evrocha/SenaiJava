
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item(); não é possível instanciar um objeto de uma classe abstrata
		
		// criando a variavel item instanciada em cogumelo
		Item item = new Cogumelo();
		item.pegar();
	
		// criando a variavel item instanciada em moeda
		item = new Moeda();
		item.pegar();
		
		// criando a variavel item instanciada em diamante
		item = new Diamante();
		item.pegar();
		
		
	}

}
