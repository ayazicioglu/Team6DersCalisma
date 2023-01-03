package S40_S44;

public class S40 {
    /*
    Bir diziyi (Array) parametre olarak kabul eden ve
    dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
    Örn:
    girdi : {1,2,3,4,5,6,7,8}
    çıkış: 36
    ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
     */
    public static void main(String[] args) {
        int [] input={1,2,3,4,5,6,7,8};


        System.out.println(arrayTopla(input));
    }

    private static int arrayTopla(int [] arr) {
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
    return toplam;
    }

}
