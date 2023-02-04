package OtomatSorusu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OtomatSoru {
      /*
        Merhaba arkadaşlar, javadan proje yapmak isteyen arkadaşlar vardı...
        projemizin adı YIYECEK OTOMATI

        --15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
        Bu ürünler ekranda listelensin

        --Ürün seçip, para miktarı giriniz
        --girdiğiniz para fazla ise üstünü versin,
        eksik ise ekleme yapmanızı istesin
        --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,
        para kontrolünü de yaparak işlem yapmaya devam etsin...
        NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
        oop concepte ait öğrendiklerimizi kullanmaya çalışalım...

        iyi çalışmalar
        Kolay gelsin...
*/

        
    static ArrayList<String> urunList = new ArrayList<>(Arrays.asList("Çikolata", "Gofret", "Biskuvi", "Kek",
            "Su", "Meyvesuyu", "ÇubukKraker"));

    static ArrayList<Integer> fiyatList = new ArrayList<>(Arrays.asList(5, 7, 10, 4, 3, 8, 6));

    static double toplam = 0;
    static int secim = 1;

    static Scanner scan = new Scanner(System.in);

        
    public static void main(String[] args) {

        do {
            System.out.println("OTOMATA HOSGELDINIZ:");
            menu();

        } while (secim!=0);


    }

    public static void menu(){

        for (int i = 1; i <= urunList.size() ; i++) {
            System.out.println(i  + ". ürün: " + urunList.get(i-1) + " fiyatı: " + fiyatList.get(i-1) + " TL");
        }
        System.out.println("Seçmek istediğiniz ürünün kodunu giriniz: Bitirmek için 0'a basınız.");
        secim = scan.nextInt();
        if (secim==1) {
            cikolata();
        }
        if (secim==2) {
            gofret();
        }
        if (secim==3) {
            biskuvi();
        }
        if (secim==4) {
            kek();
        }
        if (secim==5) {
            su();
        }
        if (secim==6) {
            meyveSuyu();
        }
        if (secim==7) {
            cubukKraker();
        }
        if (secim==0) {
            System.out.println("Sistemden çıkılıyor");
            System.exit(0);
        }

    }

    private static void cubukKraker() {
        System.out.println("Kaç adet çubuk kraker istersiniz ?");
        int adet = scan.nextInt();

        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(6);

        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz: " + (girilenPara-odenmesiGereken) + " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            cubukKraker();
        }
        menu();
    }

    private static void meyveSuyu() {
        System.out.println("Kaç adet meyvesuyu istersiniz ?");
        int adet = scan.nextInt();

        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(5);
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken) + " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            meyveSuyu();
        }
        menu();
    }

    private static void su() {
        System.out.println("Kaç adet su istersiniz ?");
        int adet = scan.nextInt();

        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(4);
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken)+ " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            su();
        }
        menu();
    }

    private static void kek() {
        System.out.println("Kaç adet kek istersiniz ?");
        int adet = scan.nextInt();

        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(3);
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken)+ " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            kek();
        }
        menu();
    }

    private static void biskuvi() {
        System.out.println("Kaç adet biskuvi istersiniz ?");
        int adet = scan.nextInt();
        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(2);
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken) + " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            biskuvi();
        }
        menu();
    }

        
    private static void cikolata() {
        System.out.println("Kaç adet çikolata istersiniz ?");
        int adet = scan.nextInt();
        int girilenPara = odeme();
        int odenmesiGereken = adet * fiyatList.get(0);
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken) + " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            cikolata();
        }
        menu();
    }

    private static void gofret() {
        System.out.println("Kaç adet gofret istersiniz ?");
        int adet = scan.nextInt();
        int odenmesiGereken = adet * fiyatList.get(1);
        int girilenPara = odeme();
        if (girilenPara>=odenmesiGereken) {
            System.out.println("Para ustunuz " + (girilenPara-odenmesiGereken) + " TL\n");
        } else {
            System.out.println( (odenmesiGereken - girilenPara) +" Lira eksik para girdiniz." );
            gofret();
        }
        menu();
    }

    private static int odeme() {
        System.out.println("Yatırmak istediğiniz tutarı giriniz:");
        int yatirilanTutar = scan.nextInt();
        int toplamMiktar = 0;
        if (yatirilanTutar==1 || yatirilanTutar==5 || yatirilanTutar==10 || yatirilanTutar==20) {
            toplamMiktar += yatirilanTutar;

        } else {
            System.out.println("Yatırılacak tutar 1 TL, 5 TL, 10 TL veya 20 TL haricinde bir tutar olamaz.");
            odeme();
        }
        return toplamMiktar;
    }
    }

