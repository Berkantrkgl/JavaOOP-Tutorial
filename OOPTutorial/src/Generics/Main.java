package Generics;

public class Main {


    
public static class Genericsinifi {

    public static <E> void yazdir(E[] array) {
        for (E e : array){
            System.out.println(e);
        }
        System.out.println();
    }
}

public static class GenericSinfi<E>{

    private E e;


    public void add(E e){
        this.e = e;
    }
    
    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    

    


}

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5}; // Burada gorudlugu gibi 3 farkli tiplerde array olusturulmasina ragmen 
        Double[] doubleArray = {1.2, 3.2, 5.2, 4.2}; // Generic olusturulan bir metod sayesinde, hepsi tek metot icine yazdirilabilmistir.
        Character[] chaArray = {'H', 'E' , 'L' , 'L' , 'O'};
        
        Genericsinifi.yazdir(intArray);
        Genericsinifi.yazdir(doubleArray);
        Genericsinifi.yazdir(chaArray);

        /*
         * Asagida ki kod satirlarinda ise generic olarak olusturulan bir sinifin, ornek olarak
         * getter ve setter metodlari ve bir diger void metod olan add olusturulmustur.
         */

        GenericSinfi<Integer> gsinif = new GenericSinfi<Integer>();
        GenericSinfi<String> gsinif2 = new GenericSinfi<String>();

        gsinif.add(123);
        gsinif2.add("Berkan");

        System.out.println("Generic degisken ; " + gsinif.getE());
        System.out.println("Generic degisken 2 : " + gsinif2.getE());









        
    }
}
