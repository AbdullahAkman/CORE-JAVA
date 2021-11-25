package day01_02_Variables;

public class C02_Variables_Copy {

	public static void main(String[] args) {
		
		String okul = "Yildiz Koleji";
		
		// ayni isim ve degisken turu ile ikinci defa variable olusturulamaz.
		// String okul = "Mehmet Koleji";
		
		//farkli data turu de olsa ayni isim ile ikinci defa variable olusturulamaz.
		// int okul = 20;
		
		
		// var olan bir variable'a yeni deger atayabiliriz.
		
		okul="Abdullah Koleji";
		
		okul = "Akman Koleji";
		
		okul = "Elemanlar";
		
		okul = "Ahmet Koleji";
		
		
		System.out.println(okul);
		
		// yazdirma isleminde aciklama eklemek istersek
		// mesela okul adi : Mehmet Koleji yazdiralim.
		
		System.out.println("okul adi : " + okul);
		System.out.println("Okulumuzun Adi : " + okul);
		System.out.println("Okulumuzun Adý : " + okul);
		
		System.out.println("Okulumuzun Adý : " + "okul" + "okuloðluokul"); 
		

	}

}
