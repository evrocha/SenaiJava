// importando classes
import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		// objeto de matematica
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois números");
		System.out.println();
		System.out.println("Digite o primeiro número");
		System.out.println();
		// atribui o valor ao x
		int x = in.nextInt();
		System.out.println("Digite o segundo número");	
		// atribui o valor ao x
		int y = in.nextInt();
		System.out.println("Digite o terceiro número");
		int z = in.nextInt();
		int soma = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma);
		
		soma = matematica.somar(x, y, 5);
		
		System.out.println("O resultado eh: " + soma);
		
		double soma2 = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma2);

	}

}
