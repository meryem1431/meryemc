package t001;

import java.util.Scanner;

public class secondrunner {

	 Scanner sc = new Scanner(System.in);
	  public void topla() {
		  System.out.println("Ka� adet say�y� toplamak istiyorsunuz?..");
		  int adet = sc.nextInt();
		  double toplam=0;
		  
		 for (int i = 0; i < adet; i++) {
			 System.out.println((i+1)+ ".say�y� yaz");
			 double sayi=sc.nextInt();
			 toplam += sayi;
					 
		 }
			  
		 
		  
			
		}
      public void cikart() {
    	  System.out.println("1.say�y�  giriniz");
   	   double sayi1 = sc.nextDouble();
   	   
   	   System.out.println("2.say�y�  giriniz");
   	   double sayi2 = sc.nextDouble();
   	   
   	   double sonuc = sayi1*sayi2;
   	   System.out.println("SONU�...."+sonuc);
   	 
    	  
      }
      public void carp() {	   
       System.out.println("1.say�y�  giriniz");
	   double sayi1 = sc.nextDouble();
	   
	   System.out.println("2.say�y�  giriniz");
	   double sayi2 = sc.nextDouble();
	   
	   double carpim = sayi1*sayi2;
	   System.out.println("SONU�...."+carpim);
	}
      public void bol() {
	   System.out.println("b�l�necek say� giriniz");
	   double sayi1 = sc.nextDouble();
	   
	   System.out.println("b�l�necek say� giriniz");
	   double sayi2 = sc.nextDouble();
	   
	   double bolum = sayi1/sayi2;
	   System.out.println("SONU�...."+bolum);
	   
	   
   }
   
	
}
	
