package m2denemeler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input_output {

	public static void main(String[] args) throws FileNotFoundException {
		//dosya ismini aratacaðým burda
		
		File fl= new File("d:\\ornek.txt");
		Scanner sc = new Scanner(fl);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
	
		sc.close();
		
		

	}

}
