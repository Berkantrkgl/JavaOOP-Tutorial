package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*Burada ArrayList lerin bagzi fonkstiyonlarini ve calisma prensibinin anlatimi yapilmistir.
         * ArrayList leri Array lerin genisletilebilir versiyonu gibi dusunebilirz. 
         * 
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");  // Add fonskiyonu ile tek tek String elemanlari eklenmistir.
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.set(1, "Renault"); // Set fonksiyonu ile, istenilen index teki elemanin guncellenme islemi yapilmistir.
        cars.remove("Mazda");

        Collections.sort(cars); // Collections sinifindan sort fonksiyonu ile ArrayList siralanma islemi yapilmistir.
        for (String s : cars){
            System.out.println("Car :  " + s); 
        }


    }  
}
