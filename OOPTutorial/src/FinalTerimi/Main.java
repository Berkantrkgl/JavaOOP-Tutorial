package FinalTerimi;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Dairenin alani : " + HesapMakinesi.daireAlan(4));
		
	}
	
	
	
	public static class HesapMakinesi {
		
		public final static double Pi = 3.14; // Final anahtar kelimesi olusturulan degiskenin degerinin bir daha 
		//degistirelemeyegini gosteriyor. Static anahtar kelimesi ile de nesne uretmeden bu degiskene erisebiliyoruz.
		public double cap;
		
		public static double daireAlan(double cap) {
			
			return Pi * (Math.pow(cap, 2));
		}
		
		
	}
	
	

}


