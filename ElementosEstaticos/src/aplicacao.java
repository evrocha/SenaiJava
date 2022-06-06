
public class aplicacao {

	public static void main(String[] args) {
		// objeto instanciado do tipo Matematica
		Matematica matematica = new Matematica();
		
		// objetos que a partir dele sao chamados os de matematica
		// os metodos pedem parametros para a execucao
//		int resultado = matematica.somar(2, 3);
//		System.out.println(resultado);
//
//		resultado = matematica.subtrair(10, 4);
//		System.out.println(resultado);
//		
//		
		 // ao tornar o metodo estatico,  nao é mais necessario instaciar objetos para se utilizar do metodos. Basta chamar  a classe de vez
//		int resultado = Matematica.somar(2, 4);
//		System.out.println(resultado);
//		resultado = Matematica.subtrair(10, 11);
//		System.out.println(resultado);
		
		// objetos de Contador
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();

		contador1.incrementar();
		
		// setando o valor inicial de valor
		contador1.setValor(9);
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor());
		
		// add valor com o metodo incrementar
		Contador.incrementar();
//		Contador.incrementar();
//		Contador.incrementar();
//		Contador.incrementar();
//		Contador.incrementar();
		System.out.println(Contador.getValor());
		  // vai dar o syso do elemtno estatico dentro da classe constantes
//		System.out.println(Constantes.MEDIA_DA_PROVA);
}
}