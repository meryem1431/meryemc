package m2denemeler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {

	public static void main(String[] args) {
		
		String ifade= " �ok bug�n hava �ok so�uk"
		+ "donabiliriz, �ok �ok �ok say�da insan da bizimle"
		+ "donabilir.";
		
		String aranacak= "^ �ok";
		Pattern p= Pattern.compile(aranacak);
		Matcher m= p.matcher(ifade);
		
		int bulunansayi=0;
		while (m.find()) {
			 bulunansayi++;
			 System.out.println("s�ralamas�......:"+bulunansayi); //s�f�rdan ba�lay�p say�yor nerde oldgnu aranan �eyin
			 System.out.println("ba�lang��. de�eri......:"+m.start());
			 System.out.println("biti� de�eri......:"+m.end());
			 System.out.println("bulunan de�er......:"+m.toString());
			 System.out.println("---------------------------------");
			 System.out.println("---------------------------------");
		}//while
				

	}//string

}//class
