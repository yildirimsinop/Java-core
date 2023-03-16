package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scan.next().charAt(0);

        if ('A' <= karakter && 'Z' >= karakter) {

            System.out.println("Buyuk harf");

        } else if ('a' <= karakter && 'z' >= karakter) {

            System.out.println("kucuk harf");
        }

        else {

            System.out.println("gecerli bir harf giriniz");
        }

    }
}
