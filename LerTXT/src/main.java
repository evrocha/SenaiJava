import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
//		 faz com que procure dentro da pasta do projeto o arquivo citado
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
		// a variavel line vai receber a linha lida	
			String line;
			String string = "";
			
		// enquanto a linha lida for diferente de null (vazio){	
		while((line = reader.readLine())!= null){
			// a string, q antes era vazia, agora é adicionado à ela a linha lida com o \n
			string += line + "\n";
		}
		// printa a string
			System.out.println(string);
		}
		
		
		String teste = "Mouse: funciona = sim, qtdBotoes=2, tamanho = pequeno \n";
	
		Mouse mouse = new Mouse(teste);
		
		System.out.println(mouse);
	}

}
