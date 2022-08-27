package StaticKullanimi;

public class Araba {
	
	public String marka;
	public int fiyat;
	public static int sayac = 0; //Static olarak olusturulan degisken nesneden bagimsiz hareket eder.
	// Bu degiskeni nesne uretmeden direk sinfinin referansi ile cagirabiliriz. Bu ayni zamanda 
	// metodlar icinde gecerli.
	
	
	public Araba(String marka, int fiyat) {
		this.marka = marka;
		this.fiyat = fiyat;
		Araba.sayac++;
	}
	
	public static void kacArabaSatildi() {
		System.out.println("Satilan araba sayisi : " + Araba.sayac);
	}
	
	
	
	
	
	
	
}
