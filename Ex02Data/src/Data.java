
public class Data {
	public static final int FORMATO_12H  = 1;
	public static final int FORMATO_24H  = 2;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
//	Construtor que receber dia, mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
//	Construtor completo, que receber informações da data e horário
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
//		 Chama o construtor da classe, o próprio construtor de cima a fim de que se economize linhas
		this(dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	} 
	
//	Imprime a data/hora formatada  (de acordo com o formato especifica)
	
	public void imprimir(int formato) {
//		Monta a string de impressão de data
		String data = dia + "/" + mes + "ano";
		
		if(hora== -1) {
//			Se hora for -1, significa que os dados de horário não foram passados no construtor. 
//			 Então exibe só a data
			System.out.println(data);
		}
		else {
//			Monta a parte da string da horário (deixa a hora de fora por enquanto)
			String horario = ":" + minuto + ":" + segundo;
			if (formato == FORMATO_24H) {
//				 Seo formato for 24h, concatena a hora no inicio da string (o atributo ja foi fornecdio no formato 35h
				horario = hora + horario;
			}
			else {
				// Se o formato for 12h
				if(hora==0) {
					horario = 12+horario;
					horario += "AM";
				} else if(hora>12) {
//					Se a hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter
//					a hora no formato 12h, e concatena o "PM" no fim
					horario =(hora-12)+horario;
					horario+="PM";
				}else if(hora==12) {
//					Se a hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter
//					a hora no formato 12h, e concatena o "PM" no fim
					horario =(hora)+horario;
					horario+="";
				}
			}
		}
	}
}
