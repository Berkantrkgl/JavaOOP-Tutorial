package ErisimBelirleiciler;

public class Car {
	
	private int motorGucu; // Erisime kapali. Sadece ozel metodlar ile diger siniflardan erisilebilir.
	public int speed; // Herkes tarafindan erisime acik degisken.
	protected String renk; //Sadece bulundugu paket icinden erisime sahip degisken.
	int modelYili; // Yine ayni paketten erisilebilir oluyor. Bu kavram protected'e yakin bir kavram aslinda.
	
	public void sanayiyeGotur(int yeniMotorGucu) {
		System.out.println("Motor Gucu Guncelleniyor...");
		this.motorGucu = yeniMotorGucu;
	}
	
	public int motorGucunuGoster() {
		return this.motorGucu;
	}
	
}
