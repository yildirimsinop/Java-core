package day45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_maps {
    public static void main(String[] args) {

        // verilen bir cumlede kullanilan herbir harfi ve o harfin kullanim miktarini
        // A=5, b=3 .. gibi yazdirin.

        String str = "Javayi balonu patlatmadan bitirelim";
        // J = 1, a = 7, v=1, y=1 ....

        String [] harflerArr = str.split("");
        System.out.println(Arrays.toString(harflerArr));

        Map<String, Integer> kullanimMiktarlariMap = new TreeMap<>();

        int sayac = 1;

        // 1- tum harfleri sirasi ile ele alacagiz.

        for (int i = 0; i < harflerArr.length; i++) {

            // 2- ele aldigimiz harfin, daha once map'e eklenip eklenmedigini kontrol edelim.

            if (kullanimMiktarlariMap.containsKey(harflerArr[i])) {
                continue;

            } else {

                // kod buraya geldiyse o harf henuz map'e eklenmemistir.
                // o zaman bu harfin kullanim miktarini bulmaliyiz.

                for (int j = i+1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])) {
                        sayac ++;

                    }

                }

                // sayma islemi bitti, Key ve Value'yu map'e ekleyelim
                kullanimMiktarlariMap.put(harflerArr[i], sayac);
                sayac = 1;

            }

        }

        System.out.println(kullanimMiktarlariMap);


    }
}
