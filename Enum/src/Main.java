
public class Main {
// constane pi com o valor estatico e constante
	public static final double PI = 3.14;
	
	
	// enum e o tipo de dado que o dev cria, nao pode ser modificado
	private enum Sexo{
		Masculino, Feminino;	
	}
	
	public static void main(String[] args) {
		// pi recebe o valor da constante de pi da classe main
		double pi = Main.PI;
		
		DiadaSemana hoje = DiadaSemana.Segunda; //"hoje" só aceita os endereços q estão presentes em "Enum".
		
		int num = DiadaSemana.Segunda.getNum();
		
		System.out.println(num);
		
		String s = "Terca";
		
		 //O método valueOf irá procurar em "DiadaSemana" algum valor q seja parecido com a info da variavel "s", ou seja, "Terça", "fazendo" uma transformação, retornando p endereço.
		hoje = DiadaSemana.valueOf(s);
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.Masculino;
		sexo = Sexo.Feminino;

	}

}
