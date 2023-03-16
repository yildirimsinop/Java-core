package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not>=50 && not<100) {

            System.out.println("sinifi gectin");

        }

        if (not<50) {

            System.out.println("malesef kaldin");
        }
    }
}
