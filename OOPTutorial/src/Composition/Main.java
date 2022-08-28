package Composition;

public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1080, 1024);
		Monitor monitor = new Monitor("Asus", "Tuf", "27", resolution);
		
		Anakart anakart = new Anakart("MSI", "Rx6600" , 3400, "6GB");
		Kasa kasa = new Kasa("GameGaraj", "GamerTyp" , 2);
		
		Bilgisayar bilgisayar = new Bilgisayar(kasa, monitor, anakart);
		
		bilgisayar.bilgisayarParcaBilgileri();
		bilgisayar.getKasa().bilgisayariAc();
		bilgisayar.getKasa().bilgisayariKapat();
		bilgisayar.getAnakart().anakartBilgileri();
		bilgisayar.getMonitor().monitoruAc();
		bilgisayar.getMonitor().monitoruKapat();
		

		
	}

}
