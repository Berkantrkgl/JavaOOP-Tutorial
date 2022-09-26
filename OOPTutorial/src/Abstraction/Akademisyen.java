package Abstraction;

public abstract class Akademisyen extends Calisan {
	private String bolum;
	private String ders;

	public Akademisyen(String isim, String telNo, String ePosta, String bolum, String ders) {
		super(isim, telNo, ePosta);
		this.bolum = bolum;
		this.ders = ders;
	}
	
	public abstract void derseGir();
	

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

}
