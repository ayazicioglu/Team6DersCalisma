package Okul;

public class Runner {
       /*
    ========= YILDIZ KOLEJI =========
    =========  ANA MENU =========
        1-Okul Bilgileri Goruntule
        2-Ogretmen Menu
        3-Ogrenci Menu
        Q-ÇIKIŞ
Okul bilgileri OKUL class'inda tutulacak ve constant(degistrillemez)
olmalidir.
Okul bilgilerine proje icerisinden her class'dan ulasilabilmelidir.
Okul Class'i SINGLETON PATTERN'e sahip olmalidir (Obje
olusturulmasina izin vermemelidir).
========= YILDIZ KOLEJI =========
 =========  OGRETMEN MENU =========
1-Ogretmenler Listesi Yazdir
2- Soyisimden Ogretmen Bulma
3- Branstan Ogretmen Bulma
4- Bilgilerini Girerek Ogretmen Ekleme
5- Kimlik No lle Kayit Silme
A-ANA MENU
Q- CIKIŞ
Ögretmenler icin Ad, Soyad, kimlik No, dogum yili ve brans
bilgileri tutulmalidir
Ö bilgileri kimilk no key olarak kullanilip bir Map'de
tutulacaktir
Listelemelerde basta bilgi satiri olacak ve tablolar duzenli olacaktir.
Soyisim veya brans bilgisi ile silme olmayacaktir
     */

    public static void main(String[] args) {

        Ogretmen.feykOgretmenEkle();

        Depo.menu();

    }
}
