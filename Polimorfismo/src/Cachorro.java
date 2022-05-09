 // a sub-classe Cachorro extende os metodos da classe pai Animal
public class Cachorro extends Animal {

	@Override
	 // subscreve o a fala "padrao" de Animal para uma especifica do cachorro 
	public void falar(){
		// determina qual o resultado do syso quando chamado o metodo falar de gato
		System.out.println("AUAUA");
	}
	// cria o metodo Morder em Cachorro 
	public void Morder(){
		System.out.println("Nhac");
	}
}
