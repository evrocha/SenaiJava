
public enum DiadaSemana { //Enum � um tipo de dado.

	Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7); //informa��es constantes. S�o separados por virgulas. Todos esses dias da semana s�o um objeto. 
	
	private int num;

	private DiadaSemana(int num) { //Ao add um construtor 
		this.num = num;
	}

	public int getNum() { //get para ter acesso a info "num".
		return num;
	}

}
