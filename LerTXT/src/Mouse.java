
public class Mouse {
	
	private String funciona;
	private String qtdBotoes;
	private String tamanho;
	
	
	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(String qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	// fazendo o override de toString p personalizar a string
	@Override
	public String toString() {
		
		//            0                                 1                                       2 
		return " Mouse: funciona=" + funciona + ", quantidade de botões=" + qtdBotoes + ", tamanho=" + tamanho + "\n";
	}
	
	public Mouse (String texto) {
		// vai ter 3 strings, ja q tem 2 virgulas
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.qtdBotoes = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar4[1].trim();

	}
	

	// construtor com parametros. vai obrigar a passar os parametros qd instanciar o objeto
	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	
	
}
