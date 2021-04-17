package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {


		/*
	     * Kullanicidan bir isim alin ve bu ismi char array'ine donusturen bir method yazin
	     * 
	     *
	     * (toCharArray methodunu kullanmayin)
	     *
	     * Input : John
	     * Output : [J, o, h, n]
	    */


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir isim giriniz");
		
		
		String isim=scan.next();
	
			System.out.println(Arrays.toString(charaDonustur(isim)));		
		}
	
	
	public static char[] charaDonustur(String isim) {
		
		char harfler[]= new char[isim.length()];
		
		for (int i = 0; i < harfler.length; i++) {
			
			harfler[i]= isim.charAt(i); 
		}
		
		return harfler;
	}

}
