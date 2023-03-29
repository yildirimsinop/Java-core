package day43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elementlerini silip
        // her elementin sadece 1 kere kullanildigi hale geitirin


        int [] arr = {6,5,2,6,8,9,7,2,3,1,3,1,5,7,6,9,1,5,4,2,9,6,3};

        Set<Integer> geciciSet = new HashSet<>();

        for (Integer each : arr
             ) {
            geciciSet.add(each);
        }

        arr= new int[geciciSet.size()]; // eski array'e yeni boyut tanimladik (9 uzunlugunda ve bos)

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0]

        // Set'deki benzersiz hale getirilen elemnetleri geciciArr'ye tasiyalim.

        int index = 0;

        for (Integer each : geciciSet
             ) {

            arr [index] = each;
            index ++;
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
