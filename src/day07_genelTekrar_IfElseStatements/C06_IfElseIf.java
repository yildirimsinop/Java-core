package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;
import java.util.SortedMap;

public class C06_IfElseIf {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu,20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");

        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");

        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy * boy));
        System.out.println("Vucut kitle endeksiniz : " + kitleEndeksi);


        if (kilo <=0 || boy <=0 || boy>300 || kilo >500) {

            System.out.println("Yanlis giris yaptiniz, lutfen tekrar giriniz");

        } else if (kitleEndeksi<20) {

            System.out.println("zayif");

        } else if (kitleEndeksi<25) {

            System.out.println("normal");

        }else if (kitleEndeksi<30) {

            System.out.println("kilolu");

        } else {

            System.out.println("obez");
        }
    }
}
