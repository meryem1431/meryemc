package t001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hatayakalama {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("bir sayý giriniz....:");
		
       try {
		int sayi1= sc.nextInt();
		int toplam=sayi1/0;
		System.out.println("Baþarýlý bir þekilde veri alýndý");
	}catch(InputMismatchException ex) {
		System.out.println("bir hata ile karþýlaþýldý");
		System.out.println(ex.toString());
	}catch(Exception ex) {
        System.out.println("aritmetik bir hata ile karþýlaþýldý... " +ex.toString());
   
    
		
	}
       
	
	
	} //string
	


	
	
}//mainclass
