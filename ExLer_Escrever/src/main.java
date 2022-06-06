import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);

		/// objeto escrever do tipo BufferedWriter
		// este bloco de codigos ira escrever as informações em um arq txt
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("exercicio.txt"))){
			System.out.println("Digite qualquer coisa:");
			String txt = sc.next();
			escrever.write(txt);
		}
		// este bloco de codigos ira ler o txt escrito anteriormente
		try(BufferedReader reader = new BufferedReader(new FileReader("exercicio.txt"))){
			String line;
			
			while((line = reader.readLine())!= null){
				line += line + "\n";
				System.out.println(line);
			}
		}
		
		sc.close();
		
		
	
	}

}
