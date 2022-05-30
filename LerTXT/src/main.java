import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		////// PRIMEIRA PARTE DO EXERCICIO
		
//		 faz com que procure dentro da pasta do projeto o arquivo citado
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
		// a variavel line vai receber a linha lida	
			String line;
			String string = "";
			
		// enquanto a linha lida for diferente de null (vazio){	
		while((line = reader.readLine())!= null){
			// a string, q antes era vazia, agora é adicionado a ela a linha lida com o \n
			string += line + "\n";
		}
		// printa a string do primeiro exercicio
//			System.out.println(string);
		}
		
		String teste = "Mouse: funciona = sim, qtdBotoes=2, tamanho = pequeno \n";
	
		
//		System.out.println(mouse);
//		System.out.println(mouse2);
//		
		
		
		
		//// SEGUNDA PARTE DO EXERCICIO
		
		
// criando objtos
		Mouse mouse = new Mouse("sim","4","medio");
		Mouse mouse2 = new Mouse( "nao", "3", "grande");
		Mouse mouse3 = new Mouse("sim","1","pequeno");

	// lista que comportará os mouses escritos
		List<Mouse>listaDeMousesEscritos = new ArrayList<Mouse>();
		// adicionando os mouses criados na lista
		listaDeMousesEscritos.add(mouse);
		listaDeMousesEscritos.add(mouse2);
		listaDeMousesEscritos.add(mouse3);

		// escrevendo a lista de mouses escritos no TXT
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entradaDeMousesEscritos.txt"))){
			for (Mouse a: listaDeMousesEscritos){
				escrever.write(a.toString());
				
				
			}		
		}
		
		
			// lendo a lista
		List<Mouse>listaDeMousesLidos = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entradaDeMousesEscritos.txt"))){
			// vai receber a linha que comportatá o objeto
			String line2;
			
			while((line2 = reader.readLine())!= null){
				
				line2 += line2 + "\n";
				Mouse lendoMouse = new Mouse(line2);
				listaDeMousesLidos.add(lendoMouse);
			}
		}
		for (Mouse lendoMouse: listaDeMousesLidos){
			System.out.println(lendoMouse);
			
			
		}	
	
		
	}

}
