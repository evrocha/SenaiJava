package empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float x=0;
		
		List<Salario> listaSalarios  = new ArrayList<Salario>();
		for(int dados = 0; dados<=1; dados++){
			Salario salarios = new Salario();
			System.out.println("Digite o nome do funcionario");
			salarios.setNome(entrada.next());
			System.out.println("Digite o salario do funcionario");
			salarios.setSalario(entrada.nextFloat());
			x = salarios.calculaMedia() ;
			listaSalarios.add(salarios);
		}
		Salario salarios = new Salario();
		for(Salario dados: listaSalarios) {
			System.out.println(dados.toString());
		}
		
		System.out.println(x);
	}

}
