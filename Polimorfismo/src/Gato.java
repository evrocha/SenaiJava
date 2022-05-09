 // a sub-classe Gato extende os metodos da classe pai Animal

public class Gato extends Animal {
	 // subscreve o a fala "padrao" de Animal para uma especifica do Gato 
	@Override
	// cria o metodo falar
	public void falar() {
		// determina qual o resultado do syso quando chamado o metodo falar de gato
		System.out.println("miau");
	}

}
