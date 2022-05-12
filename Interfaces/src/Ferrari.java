// criando a classe ferrai com a implementação da interface ferrari
public class Ferrari implements Automovel, ItemCaro {
// fazendo a implementação dos metodos sobrescrevendo-os
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou a esquerda");
	}

	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari acelerou");
		
	}
// override de ItemCaro
	@Override
	public double getPreco() {
		
		return 5555555;
	}
}
