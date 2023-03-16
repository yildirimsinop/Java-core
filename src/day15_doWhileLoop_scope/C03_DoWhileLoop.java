package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
                   While Loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir.
                   While Loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
                   bu da bazen hatalara sebep olur.
         */

        int sayi = -10;
        int toplam = 0;

        while (sayi > 0) {

            toplam += sayi * sayi;

            sayi--;
        }

        System.out.println("While toplam : " + toplam);

        sayi = -10;
        toplam = 0;

        do {
            toplam += sayi * sayi;

            sayi--;

        } while (sayi > 0) ;

        System.out.println("do While toplam : " + toplam);


        }
    }

