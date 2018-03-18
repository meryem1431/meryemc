package t001;

import java.util.Scanner;

public class denemebirki {

	public static void main(String[] args) {
		Scanner sc;
		
		
		boolean durum=true;
		int sayi=0;
		
	do {
	
		sc =new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		
		try {
			sayi=sc.nextInt();
			durum=false;
			
		} catch (Exception e) {
			durum=true;
				
		}
		
	} while (durum || (sayi<1 || sayi>9));
			
				
			
			
		
			
		
		
		
		

	}//string

}//classsonu
