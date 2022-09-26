package Polymorphism;

class Hayvan { /*
				 * Burada hayvan isimli bir sinif olusturdum ve daha sonra bu siniftan kalitim
				 * alan alt siniflar olusturdum. Hayvan sinifinda Konus isimli metodu kopek
				 * sinifinda yeniden yazarak ovverride ettim, ancak bu metodu kedi sinifinda
				 * yazmadim. Kedi sinifinda bu metod yazilmadigi icin otomatik olarak hayvan
				 * sinifindaki metod calisti.
				 */
	private String isim;

	public Hayvan(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void Konus() {
		System.out.println("Hayvan Konusuyor...");
	}

}

class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
	}

	@Override
	public void Konus() {
		System.out.println(getIsim() + " Havliyor...");
	}

}

class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);
	}

}

public class Main {

	public static void main(String[] args) {
		/* Burada Hayvan veri tipinde ve sirasiyla Hayvan, Kedi ve Kopek
		   referanslari alan 3 adet nesne olusturdum. */
		Hayvan hayvan1 = new Hayvan("Gullu"); 
		Hayvan hayvan2 = new Kedi("Behlul");
		Hayvan hayvan3 = new Kopek("Karabas");

		hayvan1.Konus();
		hayvan2.Konus();
		hayvan3.Konus();

	}

}
