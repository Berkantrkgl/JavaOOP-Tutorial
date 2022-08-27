package Inheritance;

public class Guvenlik extends Calisan {

	private int maas;
	private String vardiye;

	public Guvenlik(int id, String isim, String departman, int yas, int maas, String vardiye) {
		super(id, isim, departman, yas);
		this.vardiye = vardiye;
		this.maas = maas;
	}

	public void bilgileriGoster() {
		System.out.println("Guvenlik Id : " + getId());
		System.out.println("Guvenlik Isim : " + getIsim());
		System.out.println("Guvenlik Yas : " + getYas());
		System.out.println("Guvenlik Departman : " + getDepartman());
		System.out.println("---------------------------------------");

	}

	public void calis() {
		System.out.println("Guvenlik Calisiyor");
	}

}
