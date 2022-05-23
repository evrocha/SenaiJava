
public class Lampada {

	private boolean ligada;
	
	
	public Lampada(boolean ligada) {
		
		this.ligada = ligada;
	}

// metodo ligar faz com q o atributo da lampada seja tido como true
	void ligar(){
		this.ligada = true;
		
	}
// metodo desligar faz com q o atributo da lampada seja tido como false
	
	void desligar(){
		this.ligada = false;
		
	}
	
	// metodo q retorna o estado da llampada
	String imprimir() {
		
		if(ligada == true) 
			return "ligada";
		else
			return "Desligada";
			
		}
	}

