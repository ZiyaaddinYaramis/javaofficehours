package day05;

import java.util.Scanner;

public class Question03BenimCevap {
	
	/*
	Bir String parametre kabul eden bir method yazin, String builder kullanarak
	o Stringi ters cevirin. Sonrasında girilen String palindrome mu degil mi kontrol eden
	java kodunu yaziniz
	Eg : input : I love Java
	Output: "Reversed sentence : avaJ evol I .
	   It is not a palindrome"
	*/
	
	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ters cevirmek istediginiz String giriniz");
		
		String str = scan.next();
		
		System.out.println(stringParametre(str));
		
		
	}

	public static boolean stringParametre(String str) {
	
		boolean flag = false;
		
		StringBuilder sb = new StringBuilder(str);
	
		System.out.println(sb.reverse());
		
		
		if (sb.toString().equals(str)) {
			
			flag =true;
		}
		
		
		return flag;
		
		
	}
}

	

