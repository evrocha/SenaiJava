 //Enum é um tipo de dado.
public enum DiadaSemana {
 //infos constantes do enum. sao objetos
	Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7);
	
	private int num;

	private DiadaSemana(int num) { //o consrutor recebe um parametro
		this.num = num;
	}

	public int getNum() { //get para acessar a informacao "num".
		return num;
	}

}
