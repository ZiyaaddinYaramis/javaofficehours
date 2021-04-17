package day06;

import java.util.ArrayList;
import java.util.List;

public class Question060 {

	/*
	 * Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu
	 * yaziniz. String str=“ilovejavatoo” “ilovejavatoo” Output: o v a
	 */
	public static void main(String[] args) {
		String str2 = "techtechtechtechtech";
		String str = new String("ilovejavatoo");
		ArrayList<Character> charList = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
		// System.out.println(charList);
		tekrarliKarakterler(charList);
		
		ArrayList<Character> charList2 = new ArrayList<>();
		for (int i = 0; i < str2.length(); i++) {
			charList2.add(str2.charAt(i));
		}
		System.out.println(charList2);
		tekrarliKarakterler(charList2);
	}

	public static void tekrarliKarakterler(ArrayList<Character> a) {
		String tekrarlilar = "";
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) == a.get(j) && !tekrarlilar.contains(a.get(i) + "")) {
					tekrarlilar += a.get(i) + " ";
				}
			}
		}
		System.out.println(tekrarlilar);
	}

}