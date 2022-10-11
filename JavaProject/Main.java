package JavaProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen yasinizi giriniz : ");
        String isim = scan.nextLine();
        if (isim.equals("Berkan")){
            System.out.println("Hosgeldiniz " + isim);
        } else if (isim.equals("Aysenaz")) {
            System.out.println("Hosgeldiniz " + isim);
        } else {
            System.out.println("Hosgeldinz yarramin basi " + isim);
        }



        
    }
}
