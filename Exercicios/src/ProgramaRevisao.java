import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fundamentos.Estoque;
import fundamentos.Pessoas;

public class ProgramaRevisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
											// EXERCICIO 1
		
		//System.out.println("Cadastro de pessoas");
//		List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
//			for(int i = 1; i<3; i ++) {
//				Pessoas pessoa = new Pessoas();
//				System.out.println("Cadastro " + i);
//				
//				System.out.println("NOME: ");
//				pessoa.setNome(sc.next());
//				
//				System.out.println("SALARIO: ");
//				pessoa.setSalario(sc.nextFloat());
//				
//				listaPessoas.add(pessoa);	
//			}
//			
//			if (listaPessoas.get(0).getSalario() > listaPessoas.get(1).getSalario()) {
//				float compararSalario  = listaPessoas.get(0).getSalario() - listaPessoas.get(1).getSalario();
//				System.out.println( "A diferença de salarios e: "+compararSalario);
//				System.out.println(listaPessoas.get(0).getNome()+" tem o maior salario");
//			}
//			else {
//				float compararSalario  =  listaPessoas.get(1).getSalario() - listaPessoas.get(0).getSalario();
//				System.out.println("A diferenca de salarios e: "+compararSalario);
//				System.out.println(listaPessoas.get(1).getNome()+" tem o maior salario");
//			}
//		sc.close();
		
		
												// EXERCICIO 2
		
//		System.out.println("Calculadora de descontos");
//		
//		System.out.print("Valor: ");
//		float vlr = sc.nextFloat();
//		
//		System.out.print("Desconto: ");
//		float desc = sc.nextFloat();
//		
//		float res = vlr * (desc/100);
//		
//		
//		float resTotal = vlr - res;
//		System.out.println("O valor com desconto e: " + resTotal);
		
												// EXERCICIO 3 
		System.out.println("Estoque de Varejo");
		// add item ao estoque
		// ver quantos itens tem no estoques
		
		Estoque produto = new Estoque();
		System.out.println("Nome do produto: ");
		produto.setName(sc.next());
		
		System.out.println("Preco do produto: ");
		produto.setPrice(sc.nextDouble());
		
		System.out.println("Quantidade do produto: ");
		produto.setQtd(sc.nextInt());
		
		
		System.out.println("Adicionar quantidade ao estoque: ");
		produto.addItem(sc.nextInt());
		
		System.out.println("Remover quantidade do estoque: ");
		produto.removerItem(sc.nextInt());
		
		System.out.println(produto);
		
	}
	
}
