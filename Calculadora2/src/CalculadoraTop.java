import java.util.Scanner;
public class CalculadoraTop {

	public static void main(String[] args) {
		
		// declaração das variaveis
		int n1;
		int n2;
		
		String op = "";
		int control = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a operação desejada(+, -, *, /)");
		op = entrada.nextLine();
		
		System.out.println("Digite um valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		n2 = Integer.parseInt(entrada.nextLine());
		
		// bloco de condição para SOMA
		if (op.equals("+")) {
		
			System.out.println("O resultado da soma é: "+(n1 + n2));
			control++;
		}
		
		// bloco de condição para SUBTRAÇÃO
		if (op.equals("-")) {
			
			System.out.println("O resultado da subtração é: "+(n1 - n2));
			control++;
		}
		
		// bloco de condição para MULTIPLICAÇÃO
		if (op.equals("*")) {
			
			System.out.println("O resultado da multiplicação é: "+(n1 * n2));
			control++;
		}
		
		
		// bloco de condição para DIVISÃO
		if (op.equals("/")) {
			
			System.out.println("O resultado da divisão é: "+(n1 / n2));
			control++;
		}
		
		
		if (control == 0) {
			System.out.println("Operação inválida, tente novamente");
		}
	
		
	
	
	
	
	
	
	
	
	
	}

}
