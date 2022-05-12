// o abstract torna os metodos obrigatorios a serem usados
public abstract class Item  {
	
	private int posX;
	private int posY;
	// cria��o do metodo pegar
	
	// criando o metodo abstrato pegar. Todas as classes que extendem ela s�o obrigadas a usa-lo
	public abstract void pegar();
	
	// metodos get e set que definem  e retornam a posi��o X e y
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}	
}
