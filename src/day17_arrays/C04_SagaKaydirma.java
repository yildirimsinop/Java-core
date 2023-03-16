package day17_arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {

        // Verilen int bir Array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin.
        // arn : [3,4,5,6] ==> son hali : [6,3,4,5]

        int [] arr = {3, 4, 5, 6,7,8,9};

        int temp = arr[ arr.length-1];


        for (int i = 0; i < arr.length-1; i++) {

            arr [arr.length-1-i] = arr[arr.length-2-i];

        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
