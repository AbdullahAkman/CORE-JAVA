package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 4 ) Kullanicidan 100'den kucuk bir tamsayi isteyin.
		//	1'den baslayarak girilen sayiya kadar (sayi dahil) 3'un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yuzden kucuk bir sayi giriniz...");
		double num = scan.nextDouble();
		int sayi=(int) num;
		
		// sayi negatifse veya tam sayi degilse uyari verelim.
		scan.close();
		
		if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
			
		} else if (sayi!=num){
		
					
		}else {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 1; i <= num; i++) {
			
			if (i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}

}
