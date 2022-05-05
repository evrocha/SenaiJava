//                 extende de veiculo faz com que a heranã ocorra
public class Carro extends Veiculo {
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir(); // chama o metodo imprimir da superclasse
		System.out.println("Tem quatro porta? " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
