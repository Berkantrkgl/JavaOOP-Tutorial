package Constructorlar;

public class Musteri {

	private int musteriNo;
	private String musteriEmail;
	private String isim;
	private String tcNo;

	public Musteri() { // Burada olusturulan Constructor degerlere eger girilmezse default olarak atama
		// islemi yapiyor.

		this.musteriNo = 0;
		this.musteriEmail = "Bilgi Yok";
		this.isim = "Bilgi Yok";
		this.tcNo = "Bilgi Yok";

	}

	public Musteri(int musteriNo, String tcNo, String isim) { // Buradaki Constructor da ise kendi belirledigimiz iki
		// degiskene ,nesne olusturulurken ayni zamanda da deger atamasi yapiliyor.
		this.musteriNo = musteriNo;
		this.tcNo = tcNo;
		this.isim = isim;
	}

	public void bilgileriGoster() {

		System.out.println("Musteri No : " + this.musteriNo);
		System.out.println("Musteri Isim : " + this.isim);
		System.out.println("Musteri Tc No : " + this.tcNo);
		System.out.println("Musteri Email : " + this.musteriEmail);
		System.out.println("----------------------------------");

	}

	public int getMusteriNo() {
		return musteriNo;
	}

	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}

	public String getMusteriEmail() {
		return musteriEmail;
	}

	public void setMusteriEmail(String musteriEmail) {
		this.musteriEmail = musteriEmail;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

}
