package Composition;

public class Anakart {
	private String marka, model;
	private int fiyat;
	private String bellek;

	public Anakart(String marka, String model, int fiyat, String bellek) {
		super();
		this.marka = marka;
		this.model = model;
		this.fiyat = fiyat;
		this.bellek = bellek;
	}
	
	public void anakartBilgileri() {
		System.out.println();
		System.out.println("Anakart Marka : " + this.marka);
		System.out.println("Anakart Model : " + this.model);
		System.out.println("Anakart Fiyat : " + this.fiyat);
		System.out.println("Anakart Bellek : " + this.bellek);
		System.out.println("--------------------------------");
	}
	

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getBellek() {
		return bellek;
	}

	public void setBellek(String bellek) {
		this.bellek = bellek;
	}

}
