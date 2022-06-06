
public class Contador {
	private static int valor;

//	public Contador() {
//		this.valor =1;
//	}
//
//
//	public void incrementar() {
//		valor++;
//	}
//	
//
//	public int getValor() {
//		return valor;
//	}
//
//	public void setValor(int valor) {
//		this.valor = valor;
//	} 
//	
	// o valor é static e recebe 1
	static {
		valor = 1;
	}
	// add +1 ao valor
	public static void incrementar(){
		valor ++;
	}
	public static int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
