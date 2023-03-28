package day42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    static List<Double> notListesi = new LinkedList<>();

    public static void main(String[] args) {

        // Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin,
        //        not girme islemi bittikten sonra Q'ya basiniz.
        //        not girme islemi bittikten sonra asagidaki sekilde output hazirlayin
        //      not ortalamasi : ....
        //      ogranci sayisi : ....
        //      ortalama altindaki ogrenci sayisi : ...
        //      ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ....


        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();

        double notToplami =0;
        double notOrtalamasi;
        int ortalamaAltindakiOgrenciSayisi=0;
        int ortalama10PuanAltUstOgrenciSayisi=0;

        for (Double eachNot:notListesi
             ) {
            notToplami+= eachNot;
        }


        notOrtalamasi = notToplami/notListesi.size();
        

        for (Double eachNot : notListesi) {
            if (eachNot<notOrtalamasi)
                ortalamaAltindakiOgrenciSayisi+= 1;
        }


        int eachNot = 0;
        if (eachNot >= notOrtalamasi - 10 && eachNot <= notOrtalamasi + 10) {
            ortalama10PuanAltUstOgrenciSayisi += 1;
        }

        System.out.println("Not ortalamasi " + notOrtalamasi +
                "\nOgrenci sayisi : " + notListesi.size() +
                "\nortalama altindaki ogrenci sayisi : " + ortalama10PuanAltUstOgrenciSayisi+
                "\nortalama 10 puan alt ve ustunde olan ogrenci sayisi : " + ortalama10PuanAltUstOgrenciSayisi);

    }

    public static void notListesineDegerEkle () {

        Scanner scan = new Scanner(System.in);
        double not;
        boolean loopDevam = true;

        while (loopDevam) {

            try {
                System.out.println("Lutfen ogrenci notlarini giriniz \nbitirmek icin Q'ya basiniz");
                not = scan.nextDouble();
                notListesi.add(not);

            } catch (Exception e) {
                String girilenDeger = scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("Q")) {
                    loopDevam = false;
                    break;
                } else {

                    System.out.println("Not icin sayisal degerler girmelisiniz");
                }


            }

        }
    }
}
