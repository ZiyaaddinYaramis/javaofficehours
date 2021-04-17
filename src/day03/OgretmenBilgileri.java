package day03;

public class OgretmenBilgileri {

	
	
	
	String ogretmenIsmi; // Java default deger atar
	String ogretmenBrans; // Java default deger atar
	
	
	
	
	
	
	public OgretmenBilgileri(String brans, String isim) {
		this.ogretmenBrans= brans; // Class level'daki instance variable'lere method icinden 
								   // atama yapabilmek icin  this kullanmak zorundayiz.
		
		this.ogretmenIsmi = isim;  // Class level'daki instance variable'lere method icinden 
		                           // atama yapabilmek icin  this kullanmak zorundayiz.
	}
	
	
	
	
	
	
	public OgretmenBilgileri() {
		
	}
	
	
	
	
	
	/*
	 * Class’i olusturun bu Class’da bir Ogretmen icin gerekli
	 * bilgileri girebilecegim INSTANCE Variable’lar olusturun
	 * ve main method icinde bu variable’lara deger atayin ve yazdirin
	 * 
    */	
	
	
	
	
	
	public static void main(String[] args) {


		OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("Fen","Velihan");
		
		System.out.println(ogretmen1.ogretmenBrans);
		
		OgretmenBilgileri ogretmen2 = new OgretmenBilgileri();
		ogretmen2.ogretmenBrans = "Mat ";
		ogretmen2.ogretmenIsmi ="Can";
		
		
		System.out.println(ogretmen2.ogretmenBrans + ogretmen2.ogretmenIsmi);

	}

}
