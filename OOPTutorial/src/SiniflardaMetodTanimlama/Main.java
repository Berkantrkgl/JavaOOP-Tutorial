package SiniflardaMetodTanimlama;

public class Main {
	//Burda yapilan ornekler encapsulation anlatimina da giriyor ancak, daha sonra uzerinde detayli durulacaktir.
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.yas = -1; //Bu ornekte oldugu gibi mantik hatasi degerler girilmesi onlenemez. 
		
		ogrenci1.setOgrId(12345);
		ogrenci1.setIsim("Berkan");
		ogrenci1.setSoyisim("Turkoglu");
		ogrenci1.setSinif(-1);
		ogrenci1.setSinif(3);
		
		System.out.println("Ogrencinin sinifi : " + ogrenci1.getSinif());
		
		
		
	}

}
