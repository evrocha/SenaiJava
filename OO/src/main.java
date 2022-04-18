//import java.util.Scanner;
public class main {
		
	public static void main(String[] args) {
		Pessoas pessoa1 = new Pessoas(); //instanciando um obj
		
		pessoa1.nome = "Rafael";
		pessoa1.numFig = 4;
		
		pessoa1.receber(3);
		
		System.out.println("Pessoa 1 atual");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFig);
		
		Pessoas pessoa2 = new Pessoas();
		pessoa2.nome = "Emanuel";
		pessoa2.numFig = 6;
		
		System.out.println("Pessoa 2 atual");
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFig);
//	
//		int x=4;
//		int y=4;
//		System.out.println(x===y);
		boolean retorno = pessoa1.dar(3, pessoa2);
		
		if (retorno==true){
			System.out.println("Após realizar a operação");
			System.out.println("Pessoa 1");
			System.out.println(pessoa1.numFig);
			System.out.println(pessoa1.nome);
			System.out.println("Pessoa 2");
			System.out.println(pessoa2.numFig);
			System.out.println(pessoa2.nome);
		}
	}
}
