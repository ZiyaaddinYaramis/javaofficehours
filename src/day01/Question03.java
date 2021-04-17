package day01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 *
		 *
		 * Ornek : 
		 * Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 
		 * Girdiginiz sayinin yuzler basamagi : 8
		 *
		 *
		 */

		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 3 basamakli bir sayi giriniz");


		int sayi = scan.nextInt();

		int birlerBas = sayi % 10; // modulus 10 birler basamagini verir
		int onlarBas = (sayi / 10) % 10; 
		int yuzlerBas = sayi / 100;

		
		
		
		if ((sayi>=100 && sayi<=999) || (sayi <= -100) && (sayi>=-999)) {
			
			System.out.println("Girdiginiz sayinin birler basamagi : " + birlerBas);
			System.out.println("Girdiginiz sayinin onlar basamagi : " + onlarBas);
			System.out.println("Girdiginiz sayinin yuzler basamagi : " + yuzlerBas);
		} else { 
			System.out.println("Girdiginiz sayi 3 basamakli degildir");

		}
		
		scan.close();

	}

}
