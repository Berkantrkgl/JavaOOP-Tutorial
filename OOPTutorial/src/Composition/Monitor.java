package Composition;

public class Monitor {

	private String marka;
	private String model;
	private String inc;
	private Resolution resolution;

	public Monitor(String marka, String model, String inc, Resolution resolution) {
		super();
		this.marka = marka;
		this.model = model;
		this.inc = inc;
		this.resolution = resolution;
	}
	
	
	public void monitoruAc() {
		System.out.println("Monitor Aciliyor...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Monitor : Acik");
		
	}
	
	public void monitoruKapat() {
		System.out.println("Monitor Kapatiliyor...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Monitor : Kapali");
		
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

	public String getInc() {
		return inc;
	}

	public void setInc(String inc) {
		this.inc = inc;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}
