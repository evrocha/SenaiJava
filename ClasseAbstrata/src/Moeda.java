// criando uma subclasse de item
public class Moeda extends Item{
	// fazendo o override do metodo pegar para alterar sua mensagem
	@Override
	public void pegar() {
	System.out.println("Pegando a moeda");
	}

}
