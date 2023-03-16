package day03_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        /*Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Iki sayi giriniz " +
                "\nHer sayidan sonra enter'a basiniz");

        double girilenSayi1 = scan.nextDouble();
        double girilenSayi2 = scan.nextDouble();

        double temp = 0;

        temp = girilenSayi2;

        girilenSayi2 = girilenSayi1;

        girilenSayi1 = temp;

        System.out.println("Sayi 1'in yeni degeri " + girilenSayi1);
        System.out.println("Sayi 2'nin yeni degeri " + girilenSayi2);



    }
}
