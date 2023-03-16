package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStament {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not < 100) {

            System.out.println("sinifi gectin");

        }  else {

            System.out.println("malesef kaldin");
        }


        if (not %2 ==0) {

            System.out.println("girilen sayi cift sayidir");
        }

        else {
            System.out.println("girilen sayi tekdir");
        }

        if (not %5 ==0) {

            System.out.println("girilen sayi 5'in katidir");
        }

        else {
            System.out.println("girilen sayi 5'in kati degildir");
        }
    }
}
