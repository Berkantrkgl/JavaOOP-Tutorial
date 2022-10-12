package Strings;

public class Main {
    public static void main(String[] args) {
        char[] helloArray = { 'h' , 'e' , 'l' , 'l' , 'o'};
        String helloString = new String(helloArray);
        /*
         ! Onemli Not : Stringler immutable, yani degismezdir. Bunun guvenlik, senkronizasyon ve eszamanlilik gibi 
         ! nedenlerden dolayi bu sekildedir. Stringleri sadece referanslarini degistirebiliriz.
         */

        System.out.println(helloString); // Stringler aslinda bir karakter arrayinin birlesimidir. 

        String string1 = "Merhaba Dunya"; // String sinifindan olan fonksiyonlardan bir tanesinin kullanimi.
        System.out.println("Bu Stringin uzunlugu : " + string1.length());

        String isim = "Berkan"; 
        String isimIleSelamla = "Merhaba benim adim ".concat(isim); // Burada goruldugu gibi Stringleri concat() fonksiyonu ile birlestirebiliriz.

        System.out.println(isimIleSelamla);

    }
}
