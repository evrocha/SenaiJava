import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calculador de revestimento");
		
		Scanner sc = new Scanner(System.in);
		Paredes parede = new Paredes();
		Azulejos azulejo = new Azulejos();
		

		System.out.println("Altura da parede: ");
		parede.setHp(sc.nextFloat());

		System.out.println("Largura da parede: ");
		parede.setLp(sc.nextFloat());

		System.out.println("Altura do azulejo: ");
		azulejo.setHa(sc.nextFloat());
		
		System.out.println("Largura do azulejo: ");
		azulejo.setLa(sc.nextFloat());

		System.out.println("A área total da parede é: " + parede.areaTotalParede());
		System.out.println("O comprimento de um azulejo é: " + azulejo.compAzulejo());
	
		System.out.printf("A quantidade  de azulejos usada será: " + parede.areaTotalParede() / azulejo.compAzulejo() ); // dividir a area total da parede pela utn doa z						
	}

}
