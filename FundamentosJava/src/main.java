
public class main {

	public static void main(String[] args) {
		
				// criando variaveis de diversos tipos e mostrandos seu valor via sysdo
//		int x= 100, a = 0;
//		
//		double y = 200.3, b =  0;
//		short z = (short)100000;
//		System.out.println(z);
//		a =(int) y;
//		b = x;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a);
//		System.out.println(b);
	
				// neste bloco de codigos ha uma condiacao que le a idade de uma pessoa e, se for um valor, retorna  uma mensagem personalizada
		
		//int idadePessoa=61;
		//if(idadePessoa < 18) {
			//System.out.println("VocÃª nÃ£o pode beber");
		//}
		
		// se for outro valor, retorna outro
		
		//else if(idadePessoa < 60) {
			//System.out.println("Permitido beber");
		//}
		//else {
			//System.out.println("quanto Ã© sua aposentadoria?");
		//}
		//System.out.println("VocÃª tem " + idadePessoa);
		
		
			// bloco de codigos que, usando o switch case (escolha caso), manda uma mensagem diferente a cada dia da semana;
		// a cada CASE diferente
//		Scanner op = new Scanner(System.in);
//		System.out.println("Digite qual Ã© o dia da semana");
//		int num = op.nextInt();
//		switch(num) {
//			case 1:
//				System.out.println("Domingo" );
		// break pra interromper o case
//				break;
//			case 2:
//				System.out.println("Segunda-feira");
//				break;
//			case 3:
//				System.out.println("TerÃ§a-feira");
//				break;
//			case 4:
//				System.out.println("Quarta-feira");
//				break;
//			case 5:
//			System.out.println("Quinta-feira");
//				break;	
//			case 6:
//				System.out.println("Sexta-feira");
//					break;	
//			case 7:
//				System.out.println("SÃ¡bado");
//					break;	
		// default caso nenhuma das outras condicoes sejam atendidas
//			default:
//				System.out.println("Esse nÃºmero nÃ£o representa um dia da semana");
//	}
		
		
		// estrutra que le o caractere digitado e dependendo dele mostra uma mensagem diferente, usando o switch case
//		Scanner op = new Scanner(System.in);
//		char caractere = Integer.(op.nextLine());
//	switch(caractere) {
//	case 'a':
//		System.out.println("Seu caractere Ã© a");
//		break;
//case 'b':
//		System.out.println("Seu caractere Ã© b");
//	break;
//	default:
//	System.out.println("OpÃ§Ã£o InvÃ¡lida");
//}
//	
		
		
	// bloco de codigos que, usando o switch case (escolha caso),retorna uma mensagem diferente a cada farol de um semaforo

//		
//		Scanner op = new Scanner(System.in);
//		
//		System.out.println("Qual o farol?");
//		String farol = op.nextLine();
//		
//		switch (farol) {
//		case "Vermelho":
//			System.out.println("PARE");
//			break;
//		case "Amarelo":
//			System.out.println("AtenÃ§Ã£o!!!");
//			break;
//		
//		case "Verde":
//			System.out.println("Siga!!!");
//			break;
//		default:
//			System.out.println("Nenhuma opcao disponivel");
//		}
		
		
		//  enquanto x for menor que  10, acrescera¡ um em X e mostrara um SYSO disso
//		while(x<10) {
//			x ++;
//			System.out.println(x);
//		}
		
		
		//  
//		Scanner op = new Scanner(System.in);
//		x=555;
//		int pss;
//		System.out.println("Qual Ã© a senha do cofre?");
//
		// vai executar esse bloco de comando antes de verificar a condiÃ§Ã£o
//		do{
//			System.out.println("Digite um nÃºmero");
//			pss= op.nextInt();
//			if(pss!=x){System.out.println("Senha incorreta");}
//		}
//		while(pss!=x);
//			
//		System.out.println("Senha correta");
//		Scanner op1 = new Scanner(System.in);
//		int op1 = op.nextInt();
	
//		
//		// criando tres variaveis do tipo inteiro 
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//		// exibindo na tela o valor das variaveis
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//		
//		// criando uma matriz X do tipo double com 4 indices
//		double x[] = {3,5,3,5};
//		
//		// laÃ§o de repetiÃ§Ã£o FOR
//		// enquanto a variavel inteira aux for menor que o tamanho da matriz, acresce um em aux
//		for (int aux = 0; aux < x.length; aux ++) {
//			System.out.println("Valor do indÃ­ce" + aux + " = "+ x[aux]);
//			}
//		// matriz de tipo String
//		String nome[] = {"Rafael", "Gislene", "Lara"};
//		
//		// basicamente a mesma condicao do laco anterior
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			// se o nome contido em aux1 for gislene, retornara na tela a informaÃ§Ã£o
//			if (nome[aux1] == "Gislene"){
//				System.out.println("O indÃ­ce de Gislene Ã© = "+ aux1);
//			}
//		
//		}
//		// criando 3 matrizes. tipo int, string e double
//		int [] arrayInt = new int[5];
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble =new double[3];
//		
//		// a variavel 4 esta no terceiro indice
//		arrayInt[3] = 4;
//		
//		// neste bloco de codigos um valor int Ã© capturado via scanner a cada repetiÃ§Ã£o que for permitida, e no final hÃ¡ o retorno na tela
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//		
//		for(int aux2 =0; aux2 < numero.length; aux2++) {
//			System.out.println("Digite um nÃºmero qualquer");
//		}
//		for (int aux2=0; aux2 <numero.length; aux2++) {
//			System.out.println("IndÃ­ce " + aux2 + " = "+ numero[aux2]);
//		}
		
		// criando matrizes 
		// matriz inteira c 3 indices
		int [] arrayQualquer = new int [3];
		// matriz de Objeto com 6 indices
		Object [] arrayObject = new Object[6];
		// ja que herda de Objeto, os indices estao passiveis de receber valores de diversos tipos. de boolean ao proprio objeto
		arrayObject[0] = 12;
		arrayObject[1] = "Rafael";
		arrayObject[2] = 13.8;
		arrayObject[3] =  true;
		//c como nao foi especificado o valor de Indice , ele vai retornar NULL, ja q ao ser criado ele tem que ser inicializado com algum valor
		// quando retornar o endereço, vai ter um "[I" que indica que e uma matriz de tipo inteiro
		arrayObject[5] = arrayQualquer;
		
		
		for(int aux2 = 0; aux2 < arrayObject.length; aux2++) {
			System.out.println("Indice " + aux2 + " = " + arrayObject[aux2]);
		}
		// criando duas matrizes e indicando a qtd de indices
		int [][] arrayBidirecional = new int[4][3];
		
		arrayBidirecional[0][0] =  8;
		arrayBidirecional[2][1] = 7;
		
		// for que itera a linha da matriz
		for(int linha =0; linha < arrayBidirecional.length; linha ++) {
			// for que itera as colunas da matriz
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Indíce [" + linha + "][" + coluna + "] = "  + arrayBidirecional[linha][coluna]+ " " +
					arrayBidirecional[linha][coluna] +  " ");
			}
			System.out.println();
		} 
		
		
	}
	
}



