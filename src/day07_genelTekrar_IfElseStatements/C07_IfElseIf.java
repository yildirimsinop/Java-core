package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin



         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aldiniginiz urun adedini giriniz " +
                           "\n Lutfen liste fiyatini giriniz" +
                            "\n musteri kartiniz var ise 'E' yoksa 'H' giriniz");

        double urunAdedi = scan.nextDouble();
        double urunFiyati = scan.nextDouble();
        char uyelikDurumu = scan.next().charAt(0);

        if (uyelikDurumu == 'E' && urunAdedi>=10) {

            System.out.println("Indirim Fiyati " + (urunAdedi * urunFiyati) * 0.2);

        } else if (uyelikDurumu == 'E' && urunAdedi<10) {

            System.out.println("Indirim Fiyati " + (urunAdedi * urunFiyati) * 0.15);

        } else if (uyelikDurumu == 'H' && urunAdedi>=10) {

            System.out.println("Indirim Fiyati " + (urunAdedi * urunFiyati) * 0.15);

        } else if (uyelikDurumu == 'H' && urunAdedi<10) {

            System.out.println("Indirim Fiyati " + (urunAdedi * urunFiyati) * 0.1);

        }


    }
}
