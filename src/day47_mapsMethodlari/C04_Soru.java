package day47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {

        // Verilen bir cumlede kullanilan karakterleri
        // ve kacar kere kullanildigini yazdirin.

        String str = "Javayi balonu patlatmadan bitirelim";

        // j=1, a=7, v=1, y=1 ...

        String[] strArr = str.split("");

        Map<String, Integer> kullanimMiktarlariMap = new TreeMap<>();

        for (int i = 0; i < strArr.length; i++) {



            // ele aldigim element map'de varsa, kullanim miktarini 1 artirir

            kullanimMiktarlariMap.computeIfPresent(strArr[i], (k,v)-> v+1);


            // ele aldigim elemtn map'de yoksa kullanim miktari 1 olarak map'e ekleyecegim.

            kullanimMiktarlariMap.putIfAbsent(strArr[i], 1);

        }

        System.out.println(kullanimMiktarlariMap);
        // { =3, J=1, a=7, b=2, d=1, e=1, i=4, l=3, m=2, n=2, o=1, p=1, r=1, t=3, u=1, v=1, y=1}
    }
}
