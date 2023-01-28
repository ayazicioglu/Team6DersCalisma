package Okul;

import java.util.Scanner;

public class Depo {
    static Scanner scan=new Scanner(System.in);
    public static void menu() {
        System.out.println("========= YILDIZ KOLEJI =========\n" +
                " =========  ANA MENU =========\n" +
                "\n" +
                "        1-Okul Bilgileri Goruntule\n" +
                "        2-Ogretmen Menu\n" +
                "        3-Ogrenci Menu\n" +
                "        Q-ÇIKIŞ");

        System.out.print("Seciminizi yapınız:");
        int secim= scan.nextInt();

        switch (secim){
            case 1:
                Okul.okulBilgileriniGoruntule();
                menu();
            case 2:
                Ogretmen.menu();
            case 3:


            default :

        }


    }
}
