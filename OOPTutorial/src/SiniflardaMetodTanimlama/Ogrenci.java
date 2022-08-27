package SiniflardaMetodTanimlama;

public class Ogrenci {
	
	
	private int ogrId;
	private String isim, soyisim;
	public int yas;  // Erisim belirleyicisi public olarak girilen degisken diger siniflardan direkt erisilebilir oldugu icin-
	//kapsulleme ile metod yazilir ve anlamsiz, olmamasi gereken deger atamalarinin onune gecmek icin kullanilabilir.
	private int sinif;
	
	
	public void setSinif(int sinif) { //Bu metod kullanilarak ogrencinin kacinci sinifta oldugu if/else ile mantiga uygun hale getirilmistir.
		
		if (sinif < 0) {
			System.out.println("Ogrenci -'li deger alan bir sinifta olamaz ! ");
		}
		else {
			this.sinif = sinif;
		}
	}
	
	public int getSinif() {
		return this.sinif;
	}
	
	
	
	
	
	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	
	public int getOgrId() {
		return this.ogrId;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	
	
	
	
	
	
	
}
