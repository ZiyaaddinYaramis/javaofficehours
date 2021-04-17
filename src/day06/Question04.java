package day06;

public class Question04 {
	
	/*
	 	Bir Array'e uzunlugundan fazla eleman eklemeye calisin ve karsilasicaginiz Exception'i handle edin
	 */

	public static void main(String[] args) {
		int arr[] = {2, 15, 67, 2, 56};
		
		try {
			arr[5] = 23;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in uzunlugundan fazla eleman ekleyemezsiniz");
		}
		
	}
}
