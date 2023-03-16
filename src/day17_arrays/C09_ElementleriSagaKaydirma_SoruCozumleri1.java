package day17_arrays;

import java.util.Arrays;

public class C09_ElementleriSagaKaydirma_SoruCozumleri1 {
    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]


        int[] arr = {4, 5, 6, 7, 8, 9, 10};

        int temp = arr [arr.length -1];

        arr= elementleriSagaKaydirma(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int [] elementleriSagaKaydirma(int[] yeniArr) {

        int[] arr = {4, 5, 6, 7, 8, 9, 10};

        int temp = arr [arr.length -1];


        for (int i = 0; i < arr.length-1; i++) {

          yeniArr [yeniArr.length-1-i]  = arr [arr.length-2-i];
           yeniArr [0] = temp;

        }

        return yeniArr;

    }



}


