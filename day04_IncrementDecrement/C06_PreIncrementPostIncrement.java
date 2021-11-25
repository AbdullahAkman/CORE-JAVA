package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		// preIncrement ve post increment sadece sayi++ veya sayi-- yazimiicin gecerlidir.

		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); // 13
		
		
		System.out.println(sayi++);  // 13  bu satirda iki islem var
									// bir artirma var, birde yazdirma var
		System.out.println(sayi); // 14
		
		
		// once artirmak sonrayazdirmak isterseniz o zaman   ++sayi   yazmaliyiz.
		// once yazdirmak sonra artirmak isterseniz o zaman   sayi++   yazarýz.
		
		System.out.println(++sayi); // 15
		
		
		
		
		
	}

}
