package day04;

import java.util.Arrays;

public class Question02 {

	static int arr[]= {1,2,3,4,5,6,7};
	
	
	public static void main(String[] args) {
		/*
	     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
	     *
	     * input[]= {1,2,3,4,5,6,7}
	     * Output : 4
		*/
		
		
		//int arr[]= {1,2,3,4,5,6,7};
		
		/*double ortalama=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			ortalama = arr[i]+ ortalama;			
		}
		
		System.out.println(ortalama/2);
		*/
		
		
		ortalamabul();
	}

	public static void ortalamabul() {
		
		double ortalama=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			ortalama = arr[i]+ ortalama;			
		}
		
		System.out.println(ortalama/2);
	}

}
