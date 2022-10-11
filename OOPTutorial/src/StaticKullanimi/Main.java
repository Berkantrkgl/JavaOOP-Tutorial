package StaticKullanimi;

public class Main {

	public static void main(String[] args) {
		
		Araba.kacArabaSatildi();
		
		Araba araba1 = new Araba("Reanault", 5000000);
		Araba araba2 = new Araba("Mercedes", 100000000);
		Araba araba3 = new Araba("BMW", 560030000);

		araba1.bilgileriGoster();
		araba2.bilgileriGoster();
		araba3.bilgileriGoster();
		
		Araba.kacArabaSatildi();
		System.out.println("Static yazilan degiskeni nesne olmadan cagirma : " + Araba.sayac);
		
		

	}

}
