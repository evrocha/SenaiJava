
public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(3.0,true);
		
//		conta1.ativo = true;
//		conta1.numConta = 2;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
//		
//		conta1.receba(100.8);
//		conta1.dar(110);
		System.out.println(conta1.verSaldo());
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println(conta2.verSaldo())
		;
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Marcus");
		cliente.setCpf(65364779);
		cliente.setNumConta(4535235);
		
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
		
		if(cliente1 == cliente) {//comparação de endereços das classes
			System.out.println("Os objetos são iguais");
		}else {
			System.out.println("Os objetos são diferentes");
		}
		
		if (cliente.equals(cliente1)){//comparação de atributos
		
			System.out.println("tudo igual");
		}else {
			System.out.println("Tudo diferente");
		}
		
		
		
		
		
		
		}
	}


