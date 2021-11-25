package day04_IncrementDecrement;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
	// eger buyuk data turundeki bir veriyi daha kucuk data turundeki
	//  variable'a atamak istersek java bunu otomatik olarak yapmaz.
		
		
	int sayi1= 300;
	
	short sayi2= (short) sayi1;
	
	
	// esitligin sagi ile solundaki veri turlerifarkli oldugunda java mismacth hatasi verir.
	// hatayi gidermek icin buyuk data turundeki deger'in onune manuel onayimizi g�steren
	// (short) yazilir.
	
	System.out.println("sayi2 : " + sayi2);
	//------------------------------------------------
		
		int ali1=300;
		short ali2=(short) ali1;
		
		System.out.println("ali1: " + ali2);
		
	//--------------------------------
	
	byte sayi3=(byte) sayi2;
	
	
	System.out.println("sayi3 : " + sayi3);
	// deger byte'in sinirlarinden buyuk oldugu icin java int 300'� kendi yontemine g�re
	// byte'a donusturur  ve bu arada bizim datamiz DEG�S�R.
	
	
	double sayi4 = 87.3;
	
	int sayi5 = (int) sayi4;
	
	
	System.out.println("sayi5 : " + sayi5);

	// deger virg�ll� oldu�undan ve int'da ondalikli kisim olmad�g�ndan java ondal�kl� 
	// k�sm� keser  dolayisiyla data kaybi olu�ur.
	
	int sayi6 = 27;
	int sayi7=4;
	
	System.out.println(sayi6/sayi7); // bolme islemi yapilan iki sayi da int oldugu icin
	// java sonucu int olarak yazar.
	
	
	double sayi8=4;
	double sayi9 = 17;
	
	
	System.out.println(sayi6 / sayi8); //6,75 islem yapilan sayilardan daha geni� data t�r�ne sahip olan
	// double oldugundan sonucu double olarak yazdirir.
	
	System.out.println(sayi9/sayi7); //4.25 
	
	
	
	
	}

}
