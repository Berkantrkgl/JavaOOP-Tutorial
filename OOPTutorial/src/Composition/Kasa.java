package Composition;

public class Kasa {
	private String marka, model;
	private int agirlik;

	public Kasa(String marka, String model, int agirlik) {
		super();
		this.marka = marka;
		this.model = model;
		this.agirlik = agirlik;
	}
	
	public void bilgisayariAc() {
		System.out.println("Bilgisayar Aciliyor...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bilgisayar : Acik");
	}
	
	public void bilgisayariKapat() {
		System.out.println("Bilgisayar Kapatiliyor...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bilgisayar : Kapali");
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

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

}
