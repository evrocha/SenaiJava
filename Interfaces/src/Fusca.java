// A classe Fusca implementa os metodos da Interface Carro
public class Fusca implements Carro{

	// sobrescreve os métodos da Interface Carro
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a esquerda");
	}

	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a direita");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Fusca acelerou");
	}

	@Override
	public void AbrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Abriu a porta");
	}
	
}
