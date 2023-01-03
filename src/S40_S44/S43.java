package S40_S44;

public class S43 {
    /*
    Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim
    sonra cagırıp konsolda yazdıralım.
     */

    @Override
    public String toString() {
        return "S43{" +
                "renk='" + renk + '\'' +
                ", isim='" + isim + '\'' +
                ", sayi=" + sayi +
                '}';

    }

    String renk="sarı";
    String isim="ayşe";
    int sayi=6;
    public S43(){

    }

    public S43(String renk, String isim, int sayi){
         this.renk=renk;
         this.isim="kemal";
         this.sayi=3;

    }

    public static void main(String[] args) {

        S43 obje1 = new S43();
       /* System.out.println(obje1.renk);
        System.out.println(obje1.isim);
        System.out.println(obje1.sayi);*/

        S43 obje2=new S43("siyah","buse",8);
//        System.out.println(obje2.renk);
//        System.out.println(obje2.isim);
//        System.out.println(obje2.sayi);
        System.out.println(obje1);
        System.out.println(obje2);
    }

}
