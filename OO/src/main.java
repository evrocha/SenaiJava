import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	Pessoas pessoa1 = new Pessoas();
	Scanner entrada = new Scanner (System.in);
	Scanner enter = new Scanner(System.in);
	//pessoa1.nome = "Emanuel";
	System.out.println("Qual o nome da pessoa?");
	pessoa1.nome = entrada.nextLine();
	
	System.out.printf("Qual o número de figurinhas do () ", pessoa1.nome);
	pessoa1.numFig = enter.nextInt();
	System.out.println(pessoa1.nome);
	System.out.println(pessoa1.numFig);
	
	}

}
