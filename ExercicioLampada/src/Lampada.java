
public class Lampada {

	private boolean ligada;
	
	
	public Lampada(boolean ligada) {
		
		this.ligada = ligada;
	}


	void ligar(){
		this.ligada = true;
		
	}
	
	void desligar(){
		this.ligada = false;
		
	}
	
	String imprimir() {
		
		if(ligada == true) 
			return "ligada";
		else
			return "Desligada";
			
		}
	}

