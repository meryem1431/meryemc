package t001;

import java.util.Scanner;

public class uygulama {
	
 public void islemuygulamas� () {
 
       Scanner sc = new Scanner(System.in);
	   System.out.println("*************");
	   System.out.println("*************");
	   System.out.println("***HESAP MAKINESI***");
	   
	            
	   System.out.println("***YAPILACAK ��LEM SE�***");
	   System.out.println("1-TOPLAMA");
	   System.out.println("2-�IKARTMA");
	   System.out.println("3-�ARPMA");
	   System.out.println("4-B�LME");
	   
	   System.out.println("��lem se�...");
	    int secim= sc.nextInt();
	    while(secim<=0 || secim>5) {
	    	System.out.println("ge�erli bir se�im yap");
	    	secim=sc.nextInt(); }
	    	
	    secondrunner islm = new secondrunner();
	    switch (secim) {
		case 1: islm.topla();break;
		case 2: islm.cikart();break;
		case 3: islm.carp();break;
		default: islm.bol();break;
		
		 
}
	 System.out.println("Porgram sonland�r�ld�..");   
 }
}