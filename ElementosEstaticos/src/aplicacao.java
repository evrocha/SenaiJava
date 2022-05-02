
public class aplicacao {

	public static void main(String[] args) {
		
		Matematica matematica = new Matematica();
//		
//		int resultado = matematica.somar(2, 3);
//		System.out.println(resultado);
//
//		resultado = matematica.subtrair(10, 4);
//		System.out.println(resultado);
		 // ao tornar o metodo estatico,  nao é mais necessario instaciar objetos para se utilizar do metodos. Basta chamar  a classe de vez
//		int resultado = Matematica.somar(2, 4);
//		System.out.println(resultado);
//		resultado = Matematica.subtrair(10, 11);
//		System.out.println(resultado);
		
//		Contador contador1 = new Contador();
//		Contador contador2 = new Contador();
//		Contador contador3 = new Contador();
//
//		contador1.incrementar();
//		
//		System.out.println(contador1.getValor());
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor());
//
//		
//		Contador.incrementar();
//		Contador.incrementar();
//		Contador.incrementar();
//		System.out.println(Contador.getValor());
		System.out.println(Constantes.MEDIA_DA_PROVA);
}
}