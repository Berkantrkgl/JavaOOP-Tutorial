package ErisimBelirleiciler;

public class Main {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		
		car.speed = 200;
		car.renk = "mavi";
		car.modelYili = 2012;
		car.sanayiyeGotur(200);
		System.out.println("Arabanin yeni motor gucu : " + car.motorGucunuGoster());
	}

}
