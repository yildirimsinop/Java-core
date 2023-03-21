package day35_exceptions;

import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // ve sayinin karesini yazdirin
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi = scan.nextInt();
        System.out.println("girdiginiz sayinin karesi : ");
        System.out.println(girilenSayi*girilenSayi);




    }
}
