package Inheritance;

public class Calisan {

	private int id;
	private String isim;
	private String departman;
	private int yas;

	/*
	 * Yukarida olusturdugumuz degiskenleri calisan sinifindan guvenlik sinifina
	 * kalitim ile miras biraktik. Alt sinifta bu degiskenlerin kullanimi getter ve
	 * setter metodlari ile saglandi. Ayrica asagida yazilan calis ve
	 * bilgileriGoster metodlari overriding edilerek alt sinifta tekrardan
	 * yazilmistir.
	 */

	public Calisan(int id, String isim, String departman, int yas) {
		this.id = id;
		this.isim = isim;
		this.departman = departman;
		this.yas = yas;
	}

	public void calis() {
		System.out.println("Calisan Calisiyor...");
	}

	public void bilgileriGoster() {
		System.out.println("Calisan Id : " + this.id);
		System.out.println("Calisan Isim : " + this.isim);
		System.out.println("Calisan Yas : " + this.yas);
		System.out.println("Calisan Departman : " + this.departman);
		System.out.println("---------------------------------------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
