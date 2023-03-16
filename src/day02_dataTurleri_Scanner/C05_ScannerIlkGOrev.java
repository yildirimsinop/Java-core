package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGOrev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scan.nextDouble();

        System.out.println("Girilen sayi : " + sayi);
    }
}
