package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatement {

    public static void main(String[] args) {

        /*Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu

        buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scan.next().charAt(0);

       if ('a' <= karakter && 'z' >= karakter) {

            System.out.println(Character.toUpperCase(karakter));
        }

        else {

            System.out.println(karakter);
        }
    }
}
