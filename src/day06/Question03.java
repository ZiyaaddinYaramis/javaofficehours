package day06;

import java.util.Scanner;

public class Question03 {

	/*
	 	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
	 kullaniciya musade etmeyin(Exception throw edin)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if(yas<=0) {
			try {
				throw new IllegalArgumentException();
			}catch (Exception e) {
				System.out.println("Yasiniz 0'dan kucuk olamaz");
			}
			
		}
		
	}
}
