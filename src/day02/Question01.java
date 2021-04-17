package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
         */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		
		System.out.println("Lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		int count=0; 
		
		/*
		int index=0; 
		
		while(index<cumle.length()) { 
			
			if (cumle.substring(index, index+1).equals(harf)) {
				
				count++;
			}
			index++; 
		}
		*/
		
		for (int i = cumle.length()-1; i >=0 ; i--) {
				
			if (cumle.charAt(i) == harf) {
					count++;
				}
			}
		
			System.out.println("Girdiginiz cumlede " + harf + " karakteri " + count
					+ " kere kullanilmis");
		scan.close();
	}



}


