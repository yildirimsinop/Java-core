package day47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_mapsMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> mp1 = new HashMap<>();

        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);

        // C key olarak varsa degerini 3 artir.

        if (mp1.containsKey("C")) {

            mp1.put("C", mp1.get("C")+3);

        }

        System.out.println(mp1);

        // Map'de D yoksa value'su 11 olacak sekilde ekleyelim

        if (!mp1.containsKey("D")) {

            mp1.put("D", 11);
        }

        System.out.println(mp1); // {A=5, B=3, C=10, D=11}
    }
}
