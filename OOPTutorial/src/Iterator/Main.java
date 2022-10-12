package Iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> kitaplar = new ArrayList<String>();
        kitaplar.add("Luzumsuz Adam");
        kitaplar.add("Calikusu");
        kitaplar.add("Orta Zekalilar Cenneti");
        kitaplar.add("Kopru");

        Iterator<String> it = kitaplar.iterator();

        System.out.println(it.next()); // It.next() metodu ile iterator ArrayList' in ilk elemanina atliyor. 
        System.out.println("Burada sadece it.next ile yazilmis fonksiyon calisti.");

        while(it.hasNext()){ // Bu sebepten while dongusu ikinci elemandan basliyor. 
            System.out.println(it.next());
        }

        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(15);
        sayilar.add(2);
        sayilar.add(7);
        sayilar.add(5);
        sayilar.add(13);

        Iterator<Integer> it2 = sayilar.iterator();

        while (it2.hasNext()){ // Iterator yardimi ile ArrayList icinde filtreleme islemi yapimi.

            if (it2.next() < 10){
                it2.remove();
            }
            
        }


        

        

    }
}
