package day37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
        // eger 0 veya negatif bir sayi girerse
        // uyari olarak illegalArgumentException uyarisi verin
        // ancak kodumuz normal calismaya devan etsin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<=0) {

            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
              e.printStackTrace();
                System.out.println("yas sifir veya negatif olamaz");
            }
        }
    }
}
