
public class Aplicacao {

	public static void main(String[] args) {
	Veiculo veiculo = new Veiculo();
	veiculo.setMarca("Audi");
	veiculo.setAno(2022);
	veiculo.setModelo("A20");
	
	veiculo.imprimir();
	veiculo.buzinar();
	
	System.out.println();
	
	Carro carro = new Carro();
	carro.setMarca("Fiat");
	carro.setModelo("Uno");
	carro.setAno(1990);
	
	carro.imprimir();

	System.out.println();
	
	Caminhao caminhao = new Caminhao();
	caminhao.setMarca("Volvo");
	caminhao.setModelo("B460");
	caminhao.setAno(2323);
	
	caminhao.buzinar();
	caminhao.imprimir();
	
	System.out.println();
	
	Moto moto  = new Moto();
	moto.setMarca("Volvo");
	moto.setModelo("B460");
	moto.setAno(2323);
	
	moto.buzinar();
	moto.imprimir();
	moto.empinar();
	}
	


}
