
public class Pessoas {
//atributos	
	String nome;
	int numFig;//var global
	
//métodps	
	void receber (int numFig){												//var local {
		this.numFig += numFig;																	//variavel global: todos os metodos dentro da classe enxergam					
		//variavel local: existe apenas dentro de um metodo
	}
	
	void dar() {
		
	}
}
