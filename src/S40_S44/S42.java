package S40_S44;

public class S42 {
    /*
    Parametre olarak birden fazla tamsayı (integer) kabul eden ve
     bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
    Method name=sum
        eğer metodu bu şekilde çağırırsanız

     toplam(1,2,3) çıktı =6
	 toplam(1,2,3,4,5) çıktı =15
	 sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım
     */
    public static void main(String[] args) {

        toplam(1,2,3,4,5);
    }

    private static void toplam(int...sayilar) {
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
