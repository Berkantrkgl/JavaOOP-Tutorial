	package Composition;

public class Bilgisayar {
	private Kasa kasa;
	private Monitor monitor;
	private Anakart anakart;
	public Bilgisayar(Kasa kasa, Monitor monitor, Anakart anakart) {
		super();
		this.kasa = kasa;
		this.monitor = monitor;
		this.anakart = anakart;
	}
	
	public void bilgisayarParcaBilgileri() {
		System.out.println();
		System.out.println("Kasa Marka/Model : " + kasa.getMarka() + " / " + kasa.getModel());
		System.out.println("Monitor Marka/Model : " + monitor.getMarka() + " / " + monitor.getModel());
		System.out.println("Anakart Marka/Model : " + anakart.getMarka() + " / " + anakart.getModel());
		System.out.println("---------------------------------------");
		System.out.println();
	}
	
	
	public Kasa getKasa() {
		return kasa;
	}
	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Anakart getAnakart() {
		return anakart;
	}
	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
	
}
