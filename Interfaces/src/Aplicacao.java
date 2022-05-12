
public class Aplicacao {

	public static void main(String[] args) {
//	exemplo 1
//		// criando o obj rota
		Rota rota  = new Rota();
//		// criando o obj ferrari
		Ferrari ferrari = new Ferrari();
		
//		Fusca fusca = new Fusca();
//		rota.ir(ferrari);
//		System.out.println();
//		rota.ir(fusca);

		
// exemplo 2 -> a mesma coisa de forma mais complicada e de facil compreensa visual		
		// criando a variavel automovel instanciada em Ferrari
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
//		automovel = new Fusca();
//		rota.ir(automovel);
	
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
	
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

	
		
}
// mesma variavel se comportando de forma diferente. POLIMORFISMO com INTERFACE