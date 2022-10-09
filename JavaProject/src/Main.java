import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calisanlar calisan1 = new Calisanlar();

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim = scan.nextLine();

        calisan1.baybay(isim);
        calisan1.merhaba(isim);
    }
}