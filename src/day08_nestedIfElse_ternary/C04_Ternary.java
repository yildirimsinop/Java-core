package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alin sayi cift ise sayi = cift,
        // Degilse "tek sayi" yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen tam bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2 == 0) {

            System.out.println("Cift sayi");
        } else {

            System.out.println("Tek sayi");
        }

        System.out.println((sayi%2==0 ? "Cift sayi" : "Tek sayi"));

    }
}
