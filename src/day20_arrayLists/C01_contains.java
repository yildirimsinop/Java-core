package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        // uzun bir listeyi java'da List olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup,
        // Loop ile tum elementleri List'e ekleyebiliriz


        int [] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar);

        System.out.println(sayilar.contains(3));

        System.out.println(sayilar.contains(9));

        sayilar.clear();

        System.out.println(sayilar);
    }
}
