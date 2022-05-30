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

		/// done with scanner
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("exercicio.txt"))){
			System.out.println("Digite qualquer coisa:");

			String txt = sc.next();
			escrever.write(txt);
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("exercicio.txt"))){
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null){
				string += line + "\n";
				System.out.println(string);
			}
		}
		sc.close();
		
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("exercicio.txt"))){
			System.out.println("Digite qualquer coisa:");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		}
		
		
	
	}

}
