package Interface;

public class Akademisyen implements ICalisan {
	private String asSoyad, bolum, gorevler;

	public Akademisyen(String asSoyad, String bolum, String gorevler) {
		super();
		this.asSoyad = asSoyad;
		this.bolum = bolum;
		this.gorevler = gorevler;
	}

	@Override
	public void giris() {
		System.out.println("Calisan Giris Yapti!");

	}

	@Override
	public void cikis() {
		System.out.println("Calisan Cikis Yapti!");
	}

	@Override
	public boolean yemek(int saat) {
		System.out.println("Calisan saat " + saat + " de yemek yedi!");
		return true;
	}

	public String getAsSoyad() {
		return asSoyad;
	}

	public void setAsSoyad(String asSoyad) {
		this.asSoyad = asSoyad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

}
