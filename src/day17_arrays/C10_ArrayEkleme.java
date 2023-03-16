package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C10_ArrayEkleme {
    public static void main(String[] args) {

        // Kullanicidan pozitif tam sayi alin ve bunlari Array'a ekleyin
        // Kullanici 0'a bastiginda kayit islemi sona ersin
        // Daha sonra bu Array'i saga bir kaydirin. Son rakam ilk olsun


        int girilenSayi = 1;

        int[] yeniGirilenArray = new int[0];

        Scanner scan = new Scanner(System.in);

        while (girilenSayi != 0) {

            System.out.println("Lutfen pozitif tam sayi giriniz " +
                    "\n deger girme bittikten sonra 0'a basiniz");

            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {

                yeniGirilenArray = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(yeniGirilenArray, girilenSayi);


            }



        }

        System.out.println(Arrays.toString(yeniGirilenArray));

        }
}
