

//	public boolean ligada; // atributo que indica se ela est� ligada ou desligada
//	
//	public void ligada(boolean estado) {
//		
//	}
//	public void desligada(boolean estado) {
//		
//	}
//	public void ligar(boolean estado) {
//		this.ligada = true;
//	}
////	public void desligar (boolean estado) {
////		this. desligar(estado);= false;
////	}
//	
//	public String imprimir() {
//		
//		if (ligada = true) {
//			return "Lampada ligada";
//		}
//		else {
//			return "Lampada desligada";
//		}
//		
//	}
//	public Lampada() {
//	ligada	= true;
//	}
public class Lampada {
	private boolean ligada; // nao � visivel fora da classe
	// criar metodos ligar e desligar para informar o estado da lampada
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public Lampada(boolean ligar) {
		this.ligada = ligar;
	}

	public String imprimir() {
		if (ligada==true) {
		return	"A lampada est� ligada";
			
		} 
		else {
			return"A lampada est� desligada";
		}
		
	}
	
}
	// metodo imprimir  -  dependendo do estado mostra se a lampada esta lgiada ou desligada
	// main inicia com ela ligada, altera o estado dela e depois imprime o estado atual
	
	

	

