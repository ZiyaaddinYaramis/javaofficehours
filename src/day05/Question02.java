package day05;

import java.util.ArrayList;
import java.util.Scanner;

	/*
	 
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz. Kullanici deger girmek istemedigi zaman eklemeyi bitirin
 	
 	 */

public class Question02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<>();
		
		
		
		
		do {
			System.out.println("Deger girmek istiyorsaniz E'ye girmek istemiyorsaniz H'ye basiniz");
			
			char secim = scan.next().toUpperCase().charAt(0);
			
			if (secim == 'E') {
				
				System.out.println("Lutfen bir String deger giriniz");
				
				arrayList.add(scan.next());
				
			} else if (secim == 'H') {
				break;
			} else {
				System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
			}
			
		} while (true);
		
		System.out.println(arrayList);
	}

	
	
}
