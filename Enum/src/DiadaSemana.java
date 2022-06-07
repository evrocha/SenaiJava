
public enum DiadaSemana { //Enum é um tipo de dado.

	Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7); //informações constantes. São separados por virgulas. Todos esses dias da semana são um objeto. 
	
	private int num;

	private DiadaSemana(int num) { //Ao add um construtor 
		this.num = num;
	}

	public int getNum() { //get para ter acesso a info "num".
		return num;
	}

}
