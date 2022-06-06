import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// cadastrar 4 pessoas e receber Nome, idade, sexo (enum mas e fem) e endereço
// em endereço, receber a rua, o numero e o bairro

public class main {

	public static void main(String[] args) throws IOException  {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastro de usuário");
		// control var
	
		
		// lista de pessoa que recebe o array de pessoa
		List <Pessoa> listaDePessoasEscrito = new ArrayList<Pessoa>();
		System.out.println();
		
	
		for (int aux = 0; aux <2; aux++) {	
			// objeto que vai ser instanciado qunado o for começar
			Pessoa pessoa1 = new Pessoa();
			
			
			System.out.println();
			System.out.println("CADASTRO: " + aux);
			
			System.out.println("Digite o Nome: ");
			// set nome do objeto pessoa recebe o scanner
			pessoa1.setNome(scanner.next());
			
			System.out.println("Digite a Idade: ");
			pessoa1.setIdade(scanner.nextInt());
		
			//  setar o endereco com um noov objeto instanciado
			pessoa1.setEndereco(new Endereco());
			System.out.println("                Endereço: ");
			
															//   puxar o endereco de pessoa para 
			System.out.println("Digite a rua: "); 			// setar seus atributos
			pessoa1.getEndereco().setRua(scanner.next());

			System.out.println("Digite o bairro:");
			pessoa1.getEndereco().setBairro(scanner.next());
			
			System.out.println("Digite o número");
			pessoa1.getEndereco().setNumero(scanner.next());
		
			
			System.out.println("SEXO: 1 (M) ou 2 (F)");

			int op = 0;
			
			// enquanto for diferente de 1 ou 2 vai dar erro
			while(op!=1 && op!=2) {
				op = scanner.nextInt();
				// se for dois, via setar como sexo.FEMININO
				if (op ==2) {
					pessoa1.setSexo(Sexo.FEMININO);
				}
				else if (op == 1){
					pessoa1.setSexo(Sexo.MASCULINO);
				}
				else {
					System.out.println("Valor inserido inválido! \n");
					System.out.println("SEXO: 1 (M) ou 2 (F)");
				}
				
			}
			// no final, ainda dentro do for, é adicionado a pessoa criada a lista de pessoas
			listaDePessoasEscrito.add(pessoa1);
		}
	// vai tentar escrever a lista de pessoas escritos em um TXT
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entradaDePessoasEscritos.txt"))){
			for (Pessoa a: listaDePessoasEscrito){
				escrever.write(a.toString() + "\n");	
			}		
		}
		// array lista de pessoas lido
		List <Pessoa> listaDePessoasLido = new ArrayList<>();
		
		// lendo a lista "de objetos" Pessoa que esta em TXT
		try(BufferedReader reader = new BufferedReader(new FileReader("entradaDePessoasEscritos.txt"))){
			String line;
			
			while((line = reader.readLine())!= null){
				
				Pessoa lendoPessoa = new Pessoa(line);
				
				listaDePessoasLido.add(lendoPessoa);
			}
			for(Pessoa lendoPessoa: listaDePessoasLido) {
//				ao final, dar um SYSO na lista
				System.out.println(lendoPessoa);
			}
		}
		
	scanner.close();
		
	}

}

