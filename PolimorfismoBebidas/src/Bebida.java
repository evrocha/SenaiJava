//super-classe
public class Bebida {
	// declaração de atributos
	private String nome;
	private boolean aquecer;
	
	// criando os construtores COM dois parametros
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	// metodo preparar visivel para todos as classes e com retorno void
	public void preparar() {
		System.out.println("Pegando o copo");
	}
	// gerando os getters e os setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAquecer() {
		return aquecer;
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
}
