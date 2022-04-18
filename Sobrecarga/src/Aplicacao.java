import java.util.*;
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Matematica matematica = new Matematica();
		
		
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.printf("Resultado: %d%n", soma);
		
		soma = matematica.somar(x, y, 2);
		System.out.printf("Resultado: %d%n", soma);
		
		double soma2 = matematica.somar(x, y);
		System.out.printf("Resultado: %.2f", soma2);
	}
}

