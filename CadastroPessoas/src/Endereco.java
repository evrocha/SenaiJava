
public class Endereco {
	String rua, bairro;
	String numero;
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
	@Override
	public String toString(){
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + "]";
	}
	
}
