
public class Main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		Masculino, Feminino;
		
		
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI;
		
		DiadaSemana hoje = DiadaSemana.Segunda; //"hoje" s� aceita os endere�os q est�o presentes em "Enum".
		
		int num = DiadaSemana.Segunda.getNum();
		
		System.out.println(num);
		
		String s = "Terca";
		hoje = DiadaSemana.valueOf(s); //O m�todo valueOf ir� procurar em "DiadaSemana" alguma informa��o q se pare�a com a info da variavel "s", ou seja, "Ter�a", meio que fazendo uma transforma��o, retornando p endere�o.
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.Masculino;
		sexo = Sexo.Feminino;

	}

}
