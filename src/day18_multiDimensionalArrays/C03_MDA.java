package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

        int [][] arr = {{3,4,5}, {2,3}, {1}};


                // int [][] iki katli array belirtir.
               // ilk [] ana array'i (outerArray) kontrol eder.
               // ikinci koseli parantez ise icerdeki array'leri (innerArray) kontrol eder.

        System.out.println(arr[1][1]); //3

        System.out.println(arr[0][2]); //5

        System.out.println(arr[2].length); //1

        System.out.println(Arrays.toString(arr [1]));

        System.out.println(Arrays.toString(arr)); // [[I@e9e54c2, [I@65ab7765, [I@1b28cdfa]

        System.out.println(Arrays.deepToString(arr));

        System.out.println(arr.length); // 3

        System.out.println(arr[1].length);

    }
}
