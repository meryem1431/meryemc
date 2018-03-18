package m2denemeler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {

	public static void main(String[] args) {
		
		String ifade= " çok bugün hava çok soðuk"
		+ "donabiliriz, çok çok çok sayýda insan da bizimle"
		+ "donabilir.";
		
		String aranacak= "^ çok";
		Pattern p= Pattern.compile(aranacak);
		Matcher m= p.matcher(ifade);
		
		int bulunansayi=0;
		while (m.find()) {
			 bulunansayi++;
			 System.out.println("sýralamasý......:"+bulunansayi); //sýfýrdan baþlayýp sayýyor nerde oldgnu aranan þeyin
			 System.out.println("baþlangýç. deðeri......:"+m.start());
			 System.out.println("bitiþ deðeri......:"+m.end());
			 System.out.println("bulunan deðer......:"+m.toString());
			 System.out.println("---------------------------------");
			 System.out.println("---------------------------------");
		}//while
				

	}//string

}//class
