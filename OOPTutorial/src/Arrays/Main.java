package Arrays;

public class Main {

    public static void arrayiBastir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element : " + (i + 1) + " : " + arr[i]);
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[10]; /*
                                  * Burada bellekte 10 deger depolayacak kadar yer aciliyor.
                                  * Ancak bur array daha sonradan genisletilemez, boyutlandiralamaz.
                                  */

        arr[2] = 10;
        arr[0] = 1;

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Burada direkt olarak degerler ile birlikte bir array
                                                        // olusturulmustur.

        arrayiBastir(arr2);

    }
}
