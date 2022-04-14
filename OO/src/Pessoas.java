
public class Pessoas {
//atributos	
	String nome;
	int numFig;//var global
	
//métodps	
	void receber (int numFig){																	//var local {
		this.numFig += numFig;																	//variavel global: todos os metodos dentro da classe enxergam					
		//variavel local: existe apenas dentro de um metodo
	}
	
	boolean dar(int numFig, Pessoas pessoas){
		if (this.numFig < numFig){
			 System.out.println("Operação não pôde realizada com sucesso");
			 return false;
			 }
		
		else{
			this.numFig -= numFig;
			pessoas.receber(numFig);
			return true;
			 }
		
		}
}
