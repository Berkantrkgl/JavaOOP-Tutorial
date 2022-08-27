package Encapsulation;

public class Kitap {

	private String isim;
	private int sayfaSayisi;
	private String yazar, yayinevi;
	private int yayinlanmaYili;

	/*
	 * Encapsulation ilkesi bir sinif icinde uretile nesnelerin ozelliklerinin,
	 * sadece uretilen sinifin icerisinde olusturulan metodlar ile
	 * degistirilebilmesidir. Bu ilke ile olusturulan nesneler daha iyi bir mantik
	 * cercevesine oturtulabilir. Bu kavramda private erisim belirleyicisi ile
	 * olusturulan ve getter and setter metodlari ile degistirilip cagrilan metodlar
	 * encapsulation ilkesine uygun olusturulmustur.
	 */

	public Kitap(String isim, int sayfaSayisi, String yazar, String yayinevi, int yayinlanmaYili) {
		if (sayfaSayisi < 0) {
			System.out.println("Sayfa sayisi 0 dan kucuk olamaz. Varsayilan olarak 200 giriliyor.");
			this.sayfaSayisi = 200;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}

		if (yayinlanmaYili > 2022) {
			System.out.println("Kitap icin hatali tarih girisi ! Varsayilan olarak suanki yil giriliyor");
			this.yayinlanmaYili = 2022;
		} else {
			this.yayinlanmaYili = yayinlanmaYili;
		}
		this.isim = isim;
		this.yazar = yazar;
		this.yayinevi = yayinevi;
	}

	public void bilgileriGoster() {
		System.out.println("Kitabin Ismi : " + this.isim);
		System.out.println("Kitabin Sayfa Sayisi : " + this.sayfaSayisi);
		System.out.println("Kitabin Yazari : " + this.yazar);
		System.out.println("Kitabin Yayinevi : " + this.yayinevi);
		System.out.println("Kitabin Yayinlanma Yili : " + this.yayinlanmaYili);
		System.out.println("---------------------------------------");

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		if (sayfaSayisi < 0) {
			System.out.println("Sayfa sayisi 0 dan kucuk olamaz. Varsayilan olarak 200 giriliyor.");
			this.sayfaSayisi = 200;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getYayinevi() {
		return yayinevi;
	}

	public void setYayinevi(String yayinevi) {
		this.yayinevi = yayinevi;
	}

	public int getYayinlanmaYili() {
		return yayinlanmaYili;
	}

	public void setYayinlanmaYili(int yayinlanmaYili) {
		this.yayinlanmaYili = yayinlanmaYili;
	}

}
