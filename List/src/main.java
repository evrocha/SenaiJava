// importando as bibliotecas
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		// criando a variavel lista, q é da interface list e que é instaciada pela classe ArrayList()
		// por ser interface, nao é possivel instanciar nada diretamente nela
		List lista = new ArrayList();
		
		// add adiciona valor à lista. recebe valores de qualquer tipo
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		
//		for (int x=0; x < lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
//		
//		System.out.println();
		
		// enhanced for   -- faz com que o for comece de uma variavel 0, a condição seja o tamanho total dela, e incrememente ao passo de 1 em 1
		// funciona da mesma forma la de cima
		// valor é uma variavel que recebe a lista
		for(Object valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		// remove o valor do indice 0
		lista.remove(0);
		for(Object valor : lista) {
			System.out.println(valor);
		}
		
		// adiciiona ao indice  0 o valor "def" e manda os outros indices para a proxima posição
		lista.add(0, "def");
		for(Object valor : lista) {
			System.out.println(valor);
			}
		
		// set configura determinado  valor ao indice indicado substituindo o valor anterior
		lista.set(0, "ghi");
		for(Object valor : lista) {
			System.out.println(valor);
			}
		
		System.out.println();
		
		// apaga todo o valor da lista
		lista.clear();
		// metodo que verifica se a lista esta vazia e retorna boolean
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
		}
		
		Conta conta1 = new Conta("Luz", 15);
		Conta conta2 = new Conta ("Água", 40);
		
		
		//generic "diamonds". O tipo da lista (classe) que vai ser criada
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		// adicionou as contas 1 e 2 à listaDecCOnta
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		

		
	}

}
