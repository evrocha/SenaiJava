package fundamentos;

public class Estoque {
	private int qtd;
	private double  price;
	private String name;
	
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public double calcularPrecoTotal() {
		 return price * qtd;
	}
	
	public void removerItem(int qtd) {
		this.qtd -= qtd;
	}
	public void addItem(int qtd) {
		this.qtd += qtd;
	}
	
	@Override
	public String toString() {
		return "Estoque da Loja: \n"
				+ " Produto = " + name + 
					" \n Quantidade no estoque = " + qtd + 
						" \n Preco Unitario = "+ price  +
							"\n Preço total = " + calcularPrecoTotal();
							 
	}
	
	
	
	
}
