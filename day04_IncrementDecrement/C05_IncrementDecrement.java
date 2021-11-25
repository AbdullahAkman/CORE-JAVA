package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		// atama islemi olursa sayinindegeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez.

		int sayi1=10;
		
		System.out.println(sayi1+=5);
		// bu islem sayi1'in degerini5 artýrýp sayi1'e assign ediyor
		// dolayisiyle sayi1'in degeri kalici olarak degisiyor
		
		
		System.out.println(sayi1); // 15
		
		
		System.out.println(sayi1+12); // 27
		
		System.out.println(sayi1); // 15
		
		sayi1++;
		// her ne kadar = isareti görünmese de sayi1++ isleminde assign vardir.
		// dolayisiyla deger kalici olarak degisir.
		
		
		System.out.println(sayi1); // 16

	}

}
