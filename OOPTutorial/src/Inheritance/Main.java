package Inheritance;

public class Main {

	public static void main(String[] args) {

		Calisan calisan = new Calisan(123, "Berkan", "IK", 21);
		calisan.calis();
		calisan.bilgileriGoster();

		Guvenlik guvenlik = new Guvenlik(321, "Aysenaz", "IT", 21, 12000, "Gunduz");
		
		guvenlik.calis();
		guvenlik.bilgileriGoster();
		guvenlik.setId(12354);
		guvenlik.setYas(22);
		guvenlik.bilgileriGoster();

	}

}
