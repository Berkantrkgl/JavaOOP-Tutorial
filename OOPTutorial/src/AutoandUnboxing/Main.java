package AutoandUnboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            /*Ilkel Veri Tipleri 
             * boolean 
             * char
             * byte
             * short
             * int
             * long 
             * float    
             * double
             */

        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //Burada Integer yerine int yazamayiz, cunku int ilek bir ver tipidir.
        // Integer ise int ilkel veri tipini icinde barindiran sinifin ismidir.

        for (int i = 0 ; i < 10 ; i++){
            arrayList.add(Integer.valueOf(i*2)); 
            /*
             * Burada Autoboxing islemi manuel olarak yapilmistir. Yani ilkel olan i degiskenini 
             * ilek olmayan yapiya donusturulmustur.
             ! Ancak bu islemi java otomatik olarak kendisi yapiyor. (arrayList.add(i*2)) yaparak da ayni islemi 
             ! yapmis olacaktik.
             */

        }

        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i).intValue());
            /*
             * Burada da ayni sekilde Unboxing islemi manuel olarak yapilmistir.
             * Ancak bunu da java otomatik olarak kendisi hallediyor.
             */
        }
    }
}
