
public class Azulejos {
	private float ha; // altura azulejo
	private float la; // larg azul
	private int qtd;
	
	float comprimento;
	public float getHa() {
		return ha;
	}
	public void setHa(float ha) {
		this.ha = ha;
	}
	public float getLa() {
		return la;
	}
	public void setLa(float la) {
		this.la = la;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public float compAzulejo(){ // unitario
		comprimento = ha*la;
		return comprimento;
	}
	public float coberturaAzulejo() { // area total coberta
		return comprimento * qtd;
	}
	
}
