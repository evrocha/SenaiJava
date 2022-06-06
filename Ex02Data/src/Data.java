public class Data {
	// atributos constantes
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	// outros atributos da classe
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	//construtor que recebe dia, mês e ano como parametro
	public Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//construtor completo, que recebe informações de data e horário como parametros
	public Data (int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this (dia, mes, ano);
		// define a hora, min e sec
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	// mostra a data e a hora formatada (de acordo com o formato especificado no parametro)
	public void imprimir(int formato) {
		// monta a String de impressão de data
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			// se hora for -1, as infos não foram passados na inicializacao do construtor.
			// então, apenas a data será exibida
			System.out.println(data);
			// se a hora nao for 1..
		} else {
			//monta parte da String da horário 
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24H) {
				// Se o formato for 24h, concatena a hora no início da String (o atributo já foi
				// fornecido no formato 24h)
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				} else if (hora >= 12) {
					// Se hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter
					// a hora no formato 12h, e concatena o "PM" no fim
					horario = (hora -12) + horario;
					horario += " PM";
				} else {
					// Se a hora for menor que 12, simplesmente utiliza a própria hora e concatena
					// o "AM" no fim
					horario = hora + horario;
					horario += " AM";
				}
			}
			// Imprime a data/hora formatada
			System.out.println(data + " " + horario);
		}
	}
	
	// <!-- METODOS GET  E SET

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	
}