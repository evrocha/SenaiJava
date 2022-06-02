
public class Endereco {
	private String rua, bairro;
	private String numero;
	
	// <----  GET E SET ---->
	public String getRua() {
		return rua;
	}
	public void setRua(String rua){
		this.rua = rua;
	}
	public String getBairro(){
		return bairro;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public String getNumero(){
		return numero;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	
		
	// é preciso criar um metodo de endereco que nao recebe paramentro para fazer a sobrecarga, ja que um endereco() vai 
	// receber o paramentro de string texto
	public Endereco() {
		super();
	}
	// esse vai recber o parametro
	public Endereco(String[] arrayLinha) {
		
		String[] arrayRua = arrayLinha[3].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayBairro = arrayLinha[4].split("=");
		this.bairro = arrayBairro[1].trim();
		
		String[] arrayNumero = arrayLinha[5].split("=");
		this.numero = arrayNumero[1].trim();
	}
	
	@Override
	public String toString(){
		//                    3                   4                      5
		return "Rua =" + rua + ", Bairro = " + bairro + ", Numero = " + numero;
	}
	
	
	
}
