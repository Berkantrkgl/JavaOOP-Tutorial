package ExceptionHangling;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Burada hata olusabilecek kod satirlarini try icine aliyoruz. Buradan cikan
		 * herhangi bir hatayi catch bloklari sayesinde yakaliyoruz.
		 */

		
		try {
			int a = 2 / 0;
			System.out.println("Cevap : " + a);
		} catch (ArithmeticException e) { 
			System.out.println(e.getMessage());
		}

		int[] arr = new int[3];

		try {
			arr[4] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Bir hata olustu!");
		} finally {
			System.out.println("Finally bolumu her kosulda calisiyor!");
		}

	}

}
