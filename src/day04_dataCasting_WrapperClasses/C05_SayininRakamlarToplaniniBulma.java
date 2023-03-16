package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaniniBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();

        int rakam = girilenSayi % 10 ;

        System.out.println(girilenSayi);

        int rakamlarToplami = rakam;

        girilenSayi = girilenSayi / 10;

        rakam = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + rakam;

        girilenSayi = girilenSayi / 10;

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);



    }
}
