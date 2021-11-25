package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith__EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		// verilen cumlenin verilenkelime ile baslayip,
		// baslamadigini ve bitip bitmediginiyazdirin
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cümle girin");
		String cumle=scan.nextLine();
		System.out.println("Lutfen Kelime giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile basliyor");
			
		} else {
			System.out.println("girilen cumle " + kelime + " ile basliyor");
		}

		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
		}else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		scan.close();
	}

}
