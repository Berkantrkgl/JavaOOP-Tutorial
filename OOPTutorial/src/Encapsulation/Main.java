package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Kitap kitap1 = new Kitap("Semaver", 320, "Sait Faik Abasiyanik", "Is bankasi Yayinlari", 2002);
		Kitap kitap2 = new Kitap("Olu Canlar", 320, "Nikolay Gogol", "Can Yayinlari", 1983);
		
		kitap1.setSayfaSayisi(-132);
		
		kitap1.bilgileriGoster();
		kitap2.bilgileriGoster();
		
		

	}

}
