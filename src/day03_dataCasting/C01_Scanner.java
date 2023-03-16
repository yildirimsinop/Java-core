package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    /*

    Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
    asagidaki formmatta yazdirin.
    Isminiz : JohnSoyisminiz : DoeYasiniz : 44Kaydiniz basariyla tamamlanmistir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scan.next();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();
/*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
*/

        System.out.println("Isminiz : " + isim +
                            "\nSoyisminiz : " + soyisim +
                            "\nYasiniz : " + yas +
                             "\nKaydiniz basariyla tamamlanmistir.");


    }
}
