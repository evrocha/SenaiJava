
public class Main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		Masculino, Feminino;
		
		
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI;
		
		DiadaSemana hoje = DiadaSemana.Segunda; //"hoje" só aceita os endereços q estão presentes em "Enum".
		
		int num = DiadaSemana.Segunda.getNum();
		
		System.out.println(num);
		
		String s = "Terca";
		hoje = DiadaSemana.valueOf(s); //O método valueOf irá procurar em "DiadaSemana" alguma informação q se pareça com a info da variavel "s", ou seja, "Terça", meio que fazendo uma transformação, retornando p endereço.
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.Masculino;
		sexo = Sexo.Feminino;

	}

}
