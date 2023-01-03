package S40_S44;

import java.util.Scanner;

public class S44 {
    /*
    Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
    Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
    methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
    Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
     */
    public static void main(String[] args) {
        String isim="Ali";
        String soyisim="Bulut";

        Changename(isim,soyisim);//Kemal Bulutluöz
        Rename(isim,soyisim);//Kemal Bulutluöz
        Changesurname(isim,soyisim);//Ali Akdeniz
    }

    private static void Rename(String isim, String soyisim) {
       Changename(isim,soyisim);

    }

    private static void Changesurname(String isim,String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Soyisim giriniz");
        String soyisim2=scan.nextLine();
        System.out.println(isim+" "+soyisim2);

    }
    private static void Changename(String isim, String soyisim) {
        isim="Kemal";
        soyisim="Bulutluöz";
        System.out.println(isim+" "+soyisim);

    }
}
