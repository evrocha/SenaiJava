import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois n�meros");
		System.out.println();
		System.out.println("Digite o primeiro n�mero");
		System.out.println();
		int x = in.nextInt();
		System.out.println("Digite o segundo n�mero");
		int y = in.nextInt();
		System.out.println("Digite o terceiro n�mero");
		int z = in.nextInt();
		int soma = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma);
		
		soma = matematica.somar(x, y, 5);
		
		System.out.println("O resultado eh: " + soma);
		
		double soma2 = matematica.somar(x, y);
		
		System.out.println("O resultado eh: " + soma2);

	}

}
