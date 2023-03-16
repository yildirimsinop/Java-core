package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodIleElementleriArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int [] arr = {3, 4, 5, 6};

        int [] hasan = {57, 22, 35, 45};

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen artis miktarini giriniz");

        int artisMiktari = scan.nextInt();

        hasan= arrayElementleriniArtir(hasan, artisMiktari);

        System.out.println(Arrays.toString(hasan));

        arr = arrayElementleriniArtir(arr, 5);

        System.out.println(Arrays.toString(arr));
    }

    public static int [] arrayElementleriniArtir (int [] ilkArr, int artis) {

        for (int i = 0; i < ilkArr.length; i++) {

            ilkArr [i] += artis;


        }

        return ilkArr;
    }
}
