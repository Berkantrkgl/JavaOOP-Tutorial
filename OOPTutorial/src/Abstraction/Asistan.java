package Abstraction;

public class Asistan extends Akademisyen{
	private String yuksekLisans;

	public Asistan(String isim, String telNo, String ePosta, String bolum, String ders, String yuksekLisans) {
		super(isim, telNo, ePosta, bolum, ders);
		this.yuksekLisans = yuksekLisans;
	}

	public void lablaraGir() {
		System.out.println("Asistan Lablara Girdi!");
	}
	
	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	@Override
	public void derseGir() {
		System.out.println( getIsim() + " derse girdi!");
	}

	@Override
	public void giris() {
		System.out.println(getIsim() + " okula giris yapti!");
	}

	@Override
	public void cikis() {
		System.out.println(getIsim() + " okuldan cikis yapti!");
		
	}
	
	
	
	
}
