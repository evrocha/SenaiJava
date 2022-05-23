import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		
		// variavel q ja inicia falsa a condição ligada
		Lampada l1 = new Lampada(false);
		
		Scanner in = new Scanner(System.in);
		
		// usa o metodo imprimir para mostrar se ligada ou desligada
		System.out.println("A lampada está " + l1.imprimir());
		System.out.println();
		
		// bloco q testa a resposta fornecida e a usa para alterar a  lampada 
		System.out.println("deseja ligar a lampada?");;
		String lol = in.nextLine();
		
		if( (lol.equals("sim"))) {
		l1.ligar();
		System.out.println("Agora ela está: " + l1.imprimir());
		System.out.println();
		System.out.println( "Deseja desligar ela novamente?");
		String lo = in.nextLine();
		
	    if( (lo.equals("sim"))) {
		l1.desligar();
		System.out.println("Agora ela está: " + l1.imprimir());
		}
		
		}else if( (lol.equals("nao"))) { 
			l1.ligar();
			System.out.println("Então ela irá continuar: " + l1.imprimir());
		System.out.println("Agora ela está: " + l1.imprimir());
	}else if( (lol.equals("nao"))) { 
		l1.desligar();
		System.out.println("Então ela irá continuar: " + l1.imprimir());
		
		}
	}
}
