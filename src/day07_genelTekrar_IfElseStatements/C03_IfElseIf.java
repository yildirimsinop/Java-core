package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliryorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyrsa "3 un ve 5'in kati"
        // ikisinede bolunemiyorsa "ne 3'un ne de 5'in kati" yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir pozitif tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi %3 == 0 && sayi %5 == 0) {

            System.out.println("hem 3'e hemde 5'e bolunebilen sayidir");

        } else if (sayi %5 == 0) {

            System.out.println("5' bolunebilen bir sayidir");

        } else if (sayi %3 == 0 ) {

            System.out.println("3' bolunebilen bir sayidir");
        } else {

            System.out.println("ne 3'un ne de 5'in katidir");


            // eger bir if else if ... cumlesi else ile bitiyorsa MUTLAKA if body'lerinden 1 tanesi calisir.
        }
    }
}
