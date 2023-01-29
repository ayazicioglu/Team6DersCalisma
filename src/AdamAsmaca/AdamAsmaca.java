package AdamAsmaca;

import java.util.*;

public class AdamAsmaca { //Duration:2h30m
    	 /*
    1- Kullaniciya kelimenin uzunlugu kadar hak tani
    2- Eger kelimedeki bir harf birden fazla varsa tahmini kelimedeki tum ayni harfler icin gecerli olsun
    3- That's it bro. Let's begin
   */
     boolean bayrak=false;
     static int sayac=0;
     static String indexHarf="";
     static List<String> ipUcuCizgisi =new ArrayList<>();
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             Random rnd=new Random();
             String[] arr={"Karga","Ordek","Saka","Serce","Dogan","Kartal","Turna","Papagan","Guvercin","Tukan"};
             int rastgeleIndex=rnd.nextInt(arr.length);// Bu satır ChatGPT önerisi
             String rastgeleKelime=arr[rastgeleIndex].toUpperCase();
             int hak=rastgeleKelime.length();
             for (int i = 0; i <hak; i++) {
                 ipUcuCizgisi.add(i,"_");
             }
             System.out.println(hak+ " Harfli bir KUŞ ismi tahmin etmeye çalış");
             System.out.println(ipUcuCizgisi);
             do {
                 System.out.println("\nTahmin giriniz");
                 String girilenHarf=scan.next().toUpperCase();
                 if (rastgeleKelime.contains(girilenHarf)){
                     for (int i = 0; i < rastgeleKelime.length(); i++) {
                         indexHarf=rastgeleKelime.substring(i,i+1);
                         if (indexHarf.equalsIgnoreCase(girilenHarf)){
                             ipUcuCizgisi.set(i,girilenHarf);
                             sayac++;
                         }
                     }
                     System.out.println("Girdigin "+girilenHarf+ " harfi kelimede "+sayac+" adet vardir");
                     String ipUcuCizgisiStr=String.join(",", ipUcuCizgisi); //Bu satır ChatGPT önerisi
                     ipUcuCizgisiStr=ipUcuCizgisiStr.replace(",","");
                     System.out.println(ipUcuCizgisiStr);
                     sayac=0;

                     if (rastgeleKelime.equalsIgnoreCase(ipUcuCizgisiStr)){
                         System.out.println("Tebrikler Kazandın!");
                         System.exit(0);
                     }
                 }
                 else {
                     hak--;
                     System.out.println("Bilemedin! Tahmin için kalan hakkın: "+(hak));
                    if (hak==0){
                         System.out.println("Maalesef bilemedin, cevap "+rastgeleKelime+" idi");
                         System.exit(0);

                     }
                 }
             }while ((hak<=rastgeleKelime.length()));

         }
}
