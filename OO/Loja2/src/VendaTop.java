import java.util.Scanner;

public class VendaTop {

	public static void main(String[] args) {
		String op; //opcao1
		String op2;
		String prod1  = "";
		String prod2 = "";
		String prod3 = "";
		String prod4 = "";
		String prod12  = "";
		String prod22 = "";
		String prod32 = "";
		String prod42 = "";
		double vlr1 = 0;//calça
		double vlr2 = 0;//outros pdt
		double vlr3 = 0; //calça2
		double vlr4 = 0; //outros pt
		double vlrTot;
		
		Scanner entrada = new Scanner(System.in); 
		Scanner enter = new Scanner(System.in); 
		
		System.out.println("Bem-vindo ao Venda Top\n");
		
		System.out.println("Escolha um dos  produtos abaixo:\n \n1-Calça(R$100)\n2-Blusa(R$150)\n3-Camisa(R$300)\n4-Chapéu(R$50)\n");// calça -15%
		
		op = entrada.nextLine();
		
			if (op.equals("1")) {
				System.out.println("O produto selecionado foi uma calça de R$100.\n");
				
				System.out.println("PARABÉNS!!! Ao escolher a calça, você ganhou um desconto de 15%!!!\n");
					vlr1 = 100 * 0.85;
					prod1 = "Calça";
			}
			else if (op.equals("2")) {
				System.out.println("O produto selecionado foi uma blusa de R$150\n");
					vlr2 = 150;
					prod2  = "Blusa";
			}
			else if (op.equals("3")) {
				System.out.println("O produto selecionado foi uma camisa de R$300\n");
					vlr2 = 300;
					prod3 = "Camisa";
			}
			else if (op.equals("4")) {
				System.out.println("O produto selecionado foi um chapéu de R$50\n");
					vlr2 = 50;
					prod4 = "Chapéu";
			}
			else {
				System.out.println("Por favor, digite apenas os números correspondentes.\n");
				return;
			}
			
			System.out.println("Escolha outro  produto:\n \n1-Calça(R$100)\n2-Blusa(R$150)\n3-Camisa(R$300)\n4-Chapéu(R$50)\n");// calça -15%
			op2 = enter.nextLine();
			
				if (op2.equals("1")) {
					System.out.println("PARABÉNS!!! Ao escolher a calça, você ganhou um desconto de 15%!!!\n");
					System.out.println("O segundo produto selecionado foi uma calça de R$100.\n");
						vlr3 = 100 * 0.85;
						prod1 = "Calça";
				}
				else if (op2.equals("2")) {
					System.out.println("O segundo produto selecionado foi uma blusa de R$150.\n");
						vlr4 = 150;
						prod2  = "Blusa";
				}
				else if (op2.equals("3")) {
					System.out.println("O segundo produto selecionado foi uma camisa de R$300.\n");
						vlr4 = 300;
						prod3 = "Camisa";
				}
				else if (op2.equals("4")) {
					System.out.println("O segundo produto selecionado foi um chapéu de R$50.\n");
						vlr4 = 50;
						prod4 = "Chapéu";
				}
				else {
					System.out.println("Por favor, digite apenas os números correspondentes.\n");
					return;
				}
				
				System.out.println ();
				
				vlrTot = vlr1+vlr2+vlr3+vlr4;
				
				if (vlr1>0) {
					System.out.println("O valor total da compra, com o desconto de 15% pela calça,  é: R$ "+ vlrTot);
					System.out.println("Itens comprados: " + "" +prod1 + "" + prod2 +"" + prod3 +"" + prod4 +"" + prod12 +"" + prod22 +"" + prod32 + "" +prod42);
				}
				
				else {
					System.out.println("O valor total da compra é: R$ " + vlrTot);
					System.out.println("Itens comprados: " +"" + prod1 +"" +  prod2 +"" + prod3 +"" + prod4 +"" + prod12 +"" + prod22 + "" +prod32 +"" + prod42);
				}
	}

}
