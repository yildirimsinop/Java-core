package day20_arrayLists;

public class C08_BaskaClasstanKullanma {
    public static void main(String[] args) {

        // Verilen sayinin pozitif tam bolenleri sayisi 10"dan cok ise
        // "Guzel" yoksa "Kotu" yazdirin

        int sayi = 100;

        int pozitiftamBolenlerSayisi = C07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if (pozitiftamBolenlerSayisi > 10) {

            System.out.println("Guzel");

        } else {
            System.out.println("Kotu");
        }
    }
}