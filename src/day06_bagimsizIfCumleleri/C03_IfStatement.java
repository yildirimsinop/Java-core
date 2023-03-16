package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Ucgenin uc kenar uzunlugunu giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 ==kenar3 && kenar2>0) {

            System.out.println("eskenar ucgen");
        }
    }
}
