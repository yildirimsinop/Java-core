package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
       sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
       “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre cinsinden giriniz " +
                           "\nSonra cevirmek istediginiz birimi giriniz");

        double mesafe = scan.nextDouble();

        scan.nextLine();

        String istenilenBirim = scan.nextLine();


        if (istenilenBirim.equalsIgnoreCase ("metre")) {

            System.out.println("Mesafe Metre Cinsinden : " + mesafe * 1000);

        } else if (istenilenBirim.equalsIgnoreCase ("cantimetre")) {

            System.out.println("Mesafe Cantimetre Cinsinden : " + mesafe * 10000);

        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
