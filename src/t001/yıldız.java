package t001;

public class y�ld�z {

	public static void main(String[] args) {
		// Tgirilen say�ya g�re y�ldz olu�turmak 
		
		
		int sayi=4;
		for (int i=1; i<=sayi; i++ ) {
			for (int j=1; j<=sayi; j++) {
				if (i==1 || i==sayi || j==1 || j==sayi)
					System.out.print(" *");
							else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
