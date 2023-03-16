package day19_arrayLists;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        /*

            ArrrayList, uzunlugu esnek bir array'dir.
            Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir.

            ArrayList'in tek dezavantaji var o da elementleri tek tek eklememiz gerekmesidir.
         */

        int[] arr = {3,4};

        arr= C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr, 5);

        System.out.println(Arrays.toString(arr));

        arr= C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr, 15);

        System.out.println(Arrays.toString(arr));

        List <String> harfler = new ArrayList<>(); // bos bir list olusturur.

        System.out.println(harfler);

        harfler.add("S");
        harfler.add("L");
        harfler.add("A");

        System.out.println(harfler);

    }
}
