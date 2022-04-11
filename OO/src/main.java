import java.util.Scanner;
public class main {

	public static void main(String[] args) {
//		Pessoas pessoa1 = new Pessoas(); //instanciando um obj
//		
//		pessoa1.nome = "Rafael";
//		pessoa1.numFig = 4;
//		
//		pessoa1.receber(3);
//		
//		System.out.println(pessoa1.nome);
//		System.out.println(pessoa1.numFig);
//	}
//}
//	
Pessoas pessoa1 = new Pessoas();
Scanner entrada = new Scanner (System.in);
Scanner enter = new Scanner(System.in);
	

System.out.println("Qual o nome da pessoa?");
pessoa1.nome = entrada.nextLine();
	
System.out.printf("Qual o número de figurinhas do(a) %s", pessoa1.nome);
pessoa1.numFig = enter.nextInt();

System.out.printf("O número de cartas do(a) %s é: %d",pessoa1.nome, pessoa1.numFig);
System.out.println(pessoa1.numFig);

System.out.println("O número de cartas que ele vai receber é");
pessoa1.numFigRecebe = entrada.nextInt();

pessoa1.receber();
	System.out.printf("O(a) %s recebe  figurinhas", pessoa1.nome);
}
}
// da segunda forma nao da certo pq n puxa as informações certas