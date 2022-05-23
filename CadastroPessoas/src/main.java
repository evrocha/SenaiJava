import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// cadastrar 4 pessoas e receber Nome, idade, sexo (enum mas e fem) e endereço
// em endereço, receber a rua, o numero e o bairro

public class main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Cadastro de usuário");
//		
//		Pessoa pessoa1 = new Pessoa();
//		
//		System.out.println("Digite o nome da pessoa cadastrada");
//	
//		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastro de usuário");
		System.out.println();
		
		List <Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		
		for (int aux = 0; aux <4; aux++) {	
			
			Pessoa pessoa1 = new Pessoa();
	
			
			System.out.println("Digite o Nome: ");
			pessoa1.setNome(scanner.next());
			
			System.out.println("Digite a Idade: ");
			pessoa1.setIdade(scanner.nextInt());
		
			
			
			pessoa1.setEndereco(new Endereco());
			System.out.println("Endereço: ");
			
			
			System.out.println("Digite a rua: ");
			pessoa1.getEndereco().setRua(scanner.next());
			System.out.println(pessoa1.getEndereco().getRua());
			
			System.out.println("Digite o bairro:");
			pessoa1.getEndereco().setBairro(scanner.next());
			
			System.out.println("Digite o número");
			pessoa1.getEndereco().setNumero(scanner.nextInt());
		
			
			
//			String sexo;
			System.out.println("SEXO: 1 (M) - 2 (F) ");
			int op = scanner.nextInt();
			Sexo sexo;
		
			if (op == 1){
				sexo = Sexo.MASCULINO;
				pessoa1.setSexo(sexo);
			}
			else if(op == 2){
				sexo = Sexo.FEMININO;
				pessoa1.setSexo(sexo);
			}
		
			listaDePessoas.add(pessoa1);
		}
		for (int aux = 0; aux <4; aux++) {
			System.out.println(listaDePessoas);
		}
	
		
	}

}
