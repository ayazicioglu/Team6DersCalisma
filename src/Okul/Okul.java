package Okul;


public class Okul {
    static final String okulAdi="Yıldız Koleji";
    static final String adres="Ankara";
    static final String telefon="31211111111";
    private Okul() {
    }

    public static void okulBilgileriniGoruntule() {
        System.out.println("\nOkul Adı: "+okulAdi +"\nAdres: "+adres+"\nTelefon: "+telefon);

    }

    @Override
    public String toString() {
        return "Okul{}";
    }
}
