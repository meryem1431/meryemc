package m2denemeler;


//import java.io.IOException;

public class runner {

		/*public static void main(String[] args) throws IOException {

			      File fl= new File ("d:\\ornek.txt");
		      BufferedWriter bf= new BufferedWriter(new FileWriter (fl,false));
		      
		      bf.write("4-Yeni bir satýr ekledim "
		      		+ "  i m good ");
		      bf.newLine();
		      bf.newLine();
		      bf.newLine();
		      bf.write("4-Yeni bir satýr ekledim "
		        		+ "  i m good ");
		      
		      bf.close();
					*/
					
	//}

	 public static void main(String[] args) {
		doayaiþlemleri ds= new doayaiþlemleri();
		
	for (String item : ds.dosyaokuma("d:\\ornek2.txt")) {
		System.out.println(item);
		
	}
		
		
		
		
	}
	
		
		
		
}
