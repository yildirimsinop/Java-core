package day35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        // Kullanicidan bir inces isteyin
        // verilen bir array'den kullanicinin girdigi index'deki elementi yazdirin

        int [] arr = {3,4,5,6,8,2,5,6,8,9,1};

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index = scan.nextInt();

        System.out.println(arr[index]);

    }
}
