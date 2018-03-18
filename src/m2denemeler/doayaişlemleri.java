package m2denemeler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doayaiþlemleri {

	
		public String[] dosyaokuma(String dosyayolu) {

			File fl= new File(dosyayolu);
			Scanner sc;
			String [] okunan=null;
			try {
				sc = new Scanner(fl);
				int uzunluk=0;
				while(sc.hasNextLine()) {
					uzunluk++;
					sc.nextLine();
					
				}
				sc.close();
				okunan=new String [uzunluk];
				int i=0;
				sc = new Scanner(fl);
				while(sc.hasNextLine()) {
				okunan[i]=sc.nextLine();
				i++;
				
				}
				sc.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return okunan;
			
		
		
	}

		public void dosyayazma() {
			 File fl= new File ("d:\\ornek.txt");
		      BufferedWriter bf;
			try {
				bf = new BufferedWriter(new FileWriter (fl,false));
				 bf.write("4-Yeni bir satýr ekledim "
		      		+ "  i m good ");
		      bf.newLine();
		      bf.newLine();
		      bf.newLine();
		      bf.write("4-Yeni bir satýr ekledim "
		        		+ "  i m good ");
		      bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		     
		}
}

