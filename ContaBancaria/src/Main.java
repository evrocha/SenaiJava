
public class Main {

	public static void main(String[] args) {
		// passando os parametros do obj no construtor
		ContaBancaria conta1 = new ContaBancaria(3.0,true);
		
		System.out.println(conta1.verSaldo());
		
		// outro obj sme parametros
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.verSaldo())
		;
		
		Cliente cliente = new Cliente();
		
		// adicionando informacoes aos atributos
		cliente.setNome("Marcus");
		cliente.setCpf(65364779);
		cliente.setNumConta(4535235);
		
		// mostrando os valores
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getNumConta());
		
		System.out.println(cliente.toString());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Marcus");
		cliente1.setCpf(65364779);
		cliente1.setNumConta(4535235);
		
		System.out.println(cliente1);
		System.out.println();
		
		
		//comparação de valor endereços dos objetos
		if(cliente1 == cliente) {
			System.out.println("Os objetos são iguais");
		}else {
			System.out.println("Os objetos são diferentes");
		}
		
		//comparação dos aributos dos dois objetos pelo metodo equals()
		if (cliente.equals(cliente1)){
		
			System.out.println("tudo igual");
		}else {
			System.out.println("Tudo diferente");
		}
		
		
		
		
		
		
		}
	}


