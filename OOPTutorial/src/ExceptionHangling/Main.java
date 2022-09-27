package ExceptionHangling;

public class Main {

	public static void main(String[] args) {
		/*
		 * Burada hata olusabilecek kod satirlarini try icine aliyoruz. Buradan cikan
		 * herhangi bir hatayi catch bloklari sayesinde yakaliyoruz.
		 */

		int a;
		try {
			a = 2 / 0;
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
