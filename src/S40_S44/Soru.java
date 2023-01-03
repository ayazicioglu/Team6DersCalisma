package S40_S44;

import java.util.Arrays;

public class Soru {
    /*
    Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

     */


    public static void main(String[] args) {
        String str="ade1r4d3";
        sayilariTopla(str);
        arrayleSayilariTopla(str);
    }

    private static void arrayleSayilariTopla(String str) {
        int sayac=0;

            for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sayac++;
            }

        }
        int[] arr=new int[sayac];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                arr[i]=Integer.valueOf(str.substring(i,i+1));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sayilariTopla(String str) {
        int toplam=0;
        for (int i = 0; i <str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(toplam);
    }

}
