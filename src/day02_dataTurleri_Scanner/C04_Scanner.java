package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");



        String kullaniciIsmi = scan.nextLine();


        System.out.println("Girilen isim : " + kullaniciIsmi);



    }
}
