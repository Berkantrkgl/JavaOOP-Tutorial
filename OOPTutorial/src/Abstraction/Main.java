package Abstraction;

public class Main {

	public static void main(String[] args) {

		/*
		 * Calisan calisan = new Calisan(); **** Burada calisan sinifindan nesne
		 * uretilmiyor. Cunku calisan sinifi abstract sinif olarak olusturuldu. Bu ara
		 * siniflardan nesne uretilmesinin bazi durumlarda mantiksiz olmasini engelliyor
		 */
		
		Asistan asistan = new Asistan("Berkan", "1234", "berkan@gmail.com", "Mekatronik", "Math101", "Programming");
		asistan.giris();
		asistan.cikis();
		asistan.derseGir();
		asistan.lablaraGir();
	}

}
