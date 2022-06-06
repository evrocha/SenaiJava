import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// variavel que recebe o que vai ser escrito
			String s = "TEXTOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
			// metodo que faz com que escreva, criando um arquivo txt
			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
				// vai escrever a variavel s
				
				escrever.write(s);
			}
			
			// instanciando objetos de Mouse com os parametros
			Mouse mouse1 = new Mouse(true, 2, "pequeno");		
			Mouse mouse2 = new Mouse(false, 4, "médio");		
			Mouse mouse3 = new Mouse(true, 1, "grande");
			
			// lista de mouses que vai comportar os 3 objetos
			List<Mouse>listaDeMouses = new ArrayList<Mouse>();
			
			listaDeMouses.add(mouse1);
			listaDeMouses.add(mouse2);
			listaDeMouses.add(mouse3);
			// 
			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
				for (Mouse mouse: listaDeMouses){
					escrever.write(mouse.toString());
					
					
				}		
			}
			// mostra a lista que comporta os obj
			System.out.println(listaDeMouses);
	}

}
