package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliryorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyrsa "3 un ve 5'in kati"

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir pozitif tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi %3 ==0 && sayi %5 ==0) {

            System.out.println("3'un ve 5'in kati");

        } else if (sayi %3 ==0) {

            System.out.println("3'un kati");

        } else if (sayi%5 ==0) {

            System.out.println("5'in kati");

        }

        // bazen sartlar olasi tum durumlari karsilamaz. Bu durumda if else if ..... cumleleri else ile bitmez.
        // else ile bitmeyen if else if ... cumlelerinde bazi durumlarda hic bir if body'si devreye girmeyebilir.

    }
}
