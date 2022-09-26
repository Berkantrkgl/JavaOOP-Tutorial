package Interface;

public interface ICalisan {
	final String okul = "Tau";

	public void giris();

	public void cikis();

	public boolean yemek(int saat);

	/*
	 * Interfaceler onu implements eden siniflar icin bir recete niteligindedir.
	 * Java nin yeni nesillerinde icine degisken yazilabilse de, hala metodlar icin
	 * recete niteliginde daha cok kullanilmaktadir.
	 */
}
