package Throw;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Student.find("12");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
