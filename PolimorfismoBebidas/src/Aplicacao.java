
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}
}
