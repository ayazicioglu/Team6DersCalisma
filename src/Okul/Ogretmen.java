package Okul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    /*
Ögretmenler icin Ad, Soyad, kimlik No, dogum yili ve brans
bilgileri tutulmalidir
Ö bilgileri kimilk no key olarak kullanilip bir Map'de
tutulacaktir
 */
    static private String ogretmenAdi, ogretmenSoyad,kimlikNo,dogumYili,brans;

    static HashMap<String,String> ogretmenlerMap=new HashMap<>();
    static Scanner scan=new Scanner(System.in);

    public static void menu() {

        System.out.println("========= YILDIZ KOLEJI =========\n" +
                " =========  OGRETMEN MENU =========\n" +
                "\n" +
                "1-Ogretmenler Listesi Yazdir\n" +
                "2- Soyisimden Ogretmen Bulma\n" +
                "3- Branstan Ogretmen Bulma\n" +
                "4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                "5- Kimlik No lle Kayit Silme\n" +
                "A-ANA MENU\n" +
                "Q- CIKIŞ");

        System.out.println("\n Seciminiz: ");

        String secim= scan.next();

        switch (secim){
            case "1":
                ogretmenlerListesiniYazdir();
                menu();
            case "2":
                soyIsimdenOgretmenBulma();
                menu();
            case "3":
                branstanOgretmenBulma();
                menu();
            case "4":
                ogretmenEkle();
                menu();

            case "5":

                kimlikNoileKayitSilme();
                menu();
            case "a":
            case "A":
                Depo.menu();
            case "Q":
            case "q":
                System.out.println("Sistemde cikiliyor.");
                System.exit(0);

            default :
                System.out.println("Yanlış giriş yaptınız: ");
                menu();
        }
    }
    /*
    public static Map<Integer, String> numaraileSubeDegistirme(Map<Integer, String> ogrenciMap, int numara, String sube) {
            //1-okul numrasını bildigimiz için direkt ögenci value'ye ulaşabiliriz
            String ogrenciValue = ogrenciMap.get(numara);  // 104nolu ögreenci icin Ayse-Can-10-H-MF
            String[] valueArr = ogrenciValue.split("-");// [Ayse, Can, 10, H, MF]
            //2- sube ismini guncelleyelimm
            valueArr[3] = sube;// [Ayse, Can, 10, M, MF]
            //3-arraydeki guncel bilgileri yeniden value formatında bir String yaparız
            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];
            //4-ogrenci no yani key ile yeni value'yi map'e ekleyelim
            ogrenciMap.put(numara, yeniValue);
            return ogrenciMap;
        }
     */

        private static void kimlikNoileKayitSilme() {
                System.out.println("Silinecek ogretmen tc no giriniz:");
                String silinecekOgretmen= scan.nextLine();
                scan.next();

            System.out.println(ogretmenlerMap.remove(silinecekOgretmen)); //null dönüyor?
            System.out.println(ogretmenlerMap.containsKey(silinecekOgretmen));// false dönüyor
            if (ogretmenlerMap.containsKey(silinecekOgretmen)) {
                    ogretmenlerMap.remove(silinecekOgretmen);
                    ogretmenlerMap.remove(silinecekOgretmen, ogretmenlerMap.get(silinecekOgretmen));
                    System.out.println("Girdiginiz " + silinecekOgretmen + " tc nolu ogretmen silindi");


            }else System.out.println("Verilen kimlik no ile öğretmen bulunamadi");
        }

    private static void ogretmenEkle() {
        System.out.print("Girmek istediğiniz Öğretmenin TC No sunu giriniz: ");
        String tcNumara= scan.next();
        System.out.print("Girmek istediğiniz Öğretmenin Adını giriniz: ");
        String ogrtAdi= scan.next();
        System.out.print("Girmek istediğiniz Öğretmenin Soyadı giriniz: ");
        String ogrtSoyadi= scan.next();
        System.out.print("Girmek istediğiniz Öğretmenin doğum yılı giriniz: ");
        String dgmYili= scan.next();
        System.out.print("Girmek istediğiniz Öğretmenin bransi giriniz: ");
        String bransi= scan.next();

        String ekleValue=ogrtAdi+ ", "+ogrtSoyadi+", "+ dgmYili +", "+bransi;
        ogretmenlerMap.put(tcNumara,ekleValue);
    }

    private static void branstanOgretmenBulma() {
        System.out.println("Lutfen Aranan Öğretmenin Bransini giriniz: ");
        String brans= scan.next();

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();
        boolean flag=true;
        for (Map.Entry<String, String> each:ogretmenlerEntrySet ) {

            String eachKey=each.getKey();
            String eachValue= each.getValue();

            String eachValuarr []=eachValue.split(", ");

            if (brans.equalsIgnoreCase(eachValuarr[3])){
                System.out.printf("%11s %-6s %-8s %4s %s\n",eachKey,eachValuarr[0], eachValuarr[1],eachValuarr[2],
                        eachValuarr[3]);
                flag=false;
            }
        }
        if (flag){
            System.out.println("Aranan Bransta Öğretmen yoktur. ");
        }

    }

    private static void soyIsimdenOgretmenBulma() {
        System.out.println("Lutfen Aranan Öğretmenin Soyismini giriniz: ");
        String soyIsim= scan.next();

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();
        boolean flag=true;
        for (Map.Entry<String, String> each:ogretmenlerEntrySet ) {

            String eachKey=each.getKey();
            String eachValue= each.getValue();

            String eachValuarr []=eachValue.split(", ");

            if (soyIsim.equalsIgnoreCase(eachValuarr[1])){
                System.out.printf("%11s %-6s %-8s %4s %s\n",eachKey,eachValuarr[0], eachValuarr[1],eachValuarr[2],
                        eachValuarr[3]);
                flag=false;
            }
        }
        if (flag){
            System.out.println("Aranan Soyisimde Öğretmen yoktur. ");
        }

    }

    private static void ogretmenlerListesiniYazdir() {

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        for (Map.Entry<String, String> each:ogretmenlerEntrySet ) {

            String eachKey=each.getKey();
            String eachValue= each.getValue();

            String eachValuarr []=eachValue.split(", ");
            System.out.printf("%11s %-6s %-8s %4s %s\n",eachKey,eachValuarr[0], eachValuarr[1],eachValuarr[2],
                    eachValuarr[3]);

        }

    }


    public Ogretmen() {
    }

    public static String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public static String getOgretmenSoyad() {
        return ogretmenSoyad;
    }

    public static String getKimlikNo() {
        return kimlikNo;
    }

    public static String getDogumYili() {
        return dogumYili;
    }

    public static String getBrans() {
        return brans;
    }

    public static void setOgretmenAdi(String ogretmenAdi) {
        Ogretmen.ogretmenAdi = ogretmenAdi;
    }

    public static void setOgretmenSoyad(String ogretmenSoyad) {
        Ogretmen.ogretmenSoyad = ogretmenSoyad;
    }

    public static void setKimlikNo(String kimlikNo) {
        Ogretmen.kimlikNo = kimlikNo;
    }

    public static void setDogumYili(String dogumYili) {
        Ogretmen.dogumYili = dogumYili;
    }

    public static void setBrans(String brans) {
        Ogretmen.brans = brans;
    }

    public static void feykOgretmenEkle() {

        ogretmenlerMap.put("123456987411", "Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415", "Alp, Yan, 1984, Matematik");

    }
}
