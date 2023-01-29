package AdamAsmaca;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdamAsmaca {
    	 /*
    1- Kullaniciya kelimenin uzunlugu kadar hak tani
    2- Eger kelimedeki bir harf birden fazla varsa tahmini kelimedeki tum ayni harfler icin gecerli olsun
    3- That's it bro. Let's begin
   */static int sayac=0;
     static String indexHarf="";
     static String yardimciCizgi="";
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             String[] arr={"Karga","Ordek","Saka","Serce","Dogan","Kartal","Turna","Papagan","Guvercin"};
             System.out.println("Bir kuş ismi tahmin etmeye çalış");
             Random rnd=new Random();
             int rastgeleIndex=rnd.nextInt(arr.length);
             String rastgeleKelime=arr[rastgeleIndex].toUpperCase();
             List<String> rastgeleKelimeList= Arrays.asList(rastgeleKelime);

             System.out.println(rastgeleKelime);//bu satırı çıkar!
             int hak=rastgeleKelime.length();
             for (int i = 1; i <=hak; i++) {
                 System.out.print((yardimciCizgi = "_"));
                 }
             do {
                 System.out.println("\nTahmin giriniz");
                 String harf=scan.next().toUpperCase();
                 if (rastgeleKelime.contains(harf)){
                     for (int i = 0; i < rastgeleKelime.length(); i++) {
                         indexHarf=rastgeleKelime.substring(i,i+1);
                         if (indexHarf.equalsIgnoreCase(harf)){
                             sayac++;
                         }
                     }

                     System.out.println("Girdiginiz harf "+harf+" kelimede "+sayac+" adet vardir");
                     System.out.println(yardimciCizgi.replace('_',harf.charAt(0)));
                     System.out.println(yardimciCizgi);

                 }else {
                     hak--;
                     System.out.println("Tahmin için "+(hak)+" hakkın daha var");
                    if (hak==0){
                         System.out.println("Maalesef bilemediniz, cevap "+rastgeleKelime+" idi");

                     }

                 }

             }while ((hak<=rastgeleKelime.length()));



         }
}
