package Constructorlar;

public class Main {

	public static void main(String[] args) {

		Musteri musteri1 = new Musteri();
		musteri1.setIsim("Aysenaz Akpinar"); // Nesnenin ozelliklerine deger atama islemi Constructor olmadan bu sekilde
											 // tek tek set metodlari ile yapiliyor.
		musteri1.setMusteriNo(3214); // Zaman zaman bu islem zahmetli olabiliyor.

		Musteri musteri2 = new Musteri(12345, "49090832832", "Berkan Turkoglu"); // Bu sekilde Constructor ile kolay bir
																					// sekilde yapiliyor.

		musteri1.bilgileriGoster();
		musteri2.bilgileriGoster();
	}

}
