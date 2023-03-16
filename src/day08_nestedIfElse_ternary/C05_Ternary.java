package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alip, mutlak degerine cevirin ve yazdirin

        Scanner scan = new Scanner(System.in);

        // System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scan.nextInt();
/*
        if (sayi>=0) {

            System.out.println(sayi);

        } else

            sayi = sayi * (-1);


 */

        System.out.println(sayi);

        System.out.println(sayi = sayi>=0 ? sayi : sayi* (-1));
    }
}
