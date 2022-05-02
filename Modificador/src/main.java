
public class main {

	public static void main(String[] args) {
		// tipo       var      op de construcao  construtor
		ContaBancaria conta1 = new ContaBancaria(true, 3d);
	
//		conta1.ativo =true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
//
		conta1.receber(100.8);
		conta1.dar(200);
		// com o syso o valor sera mostrado na tela de acordo com o retorno
		System.out.println(conta1.saldo());
		ContaBancaria conta2 = new ContaBancaria();
		
		System.out.println(conta2.saldo());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("vitor");
		cliente1.setCpf(232323);
		cliente1.setNumConta(442444);

//		System.out.printf("--Informações do Cliente--\nNome: %s\nCPF: %d\nNumero da conta: %d", cliente.getNome(), cliente.getCpf(), cliente.getNumConta());
//		System.out.println(cliente.toString());
//		System.out.println(cliente);

		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("vitor");
		cliente2.setCpf(232323);
		cliente2.setNumConta(44444);
		
//		cliente2 = cliente1; // faz com que iguale o endereço da heap
		System.out.println(cliente2);
	
		
		if (cliente1.getNome() == cliente2.getNome()) {
			System.out.println("São nomes iguais");
		}
		else {
		System.out.println("são nomes diferentes");
		}
		
		
		if (cliente1==cliente2) {
			System.out.println("Os objetos são iguais");
		}
		else {
			System.out.println("São objetos diferente");
		}
		
		
		if(cliente1.equals(cliente2)) {
			System.out.println("Os atributos dos objetos são iguais");
		}
		else {
			System.out.println("Os atributos dos objetos não são iguais");
		}
		
		
			}
		}

